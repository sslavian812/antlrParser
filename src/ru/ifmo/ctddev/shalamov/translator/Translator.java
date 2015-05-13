package ru.ifmo.ctddev.shalamov.translator;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListTransducedAccessorImpl;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import ru.ifmo.ctddev.shalamov.goodLang.GoodLangBaseVisitor;
import ru.ifmo.ctddev.shalamov.goodLang.GoodLangLexer;
import ru.ifmo.ctddev.shalamov.goodLang.GoodLangParser;


import java.io.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by viacheslav on 07.05.2015.
 */
public class Translator {
    private InputStream input;
    private PrintWriter output;
    private GoodLangParser.ProgramContext root;


    private int indents = 0;

    public Translator(FileInputStream fileInputStream, PrintWriter printWriter) {
        input = fileInputStream;
        output = printWriter;

    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: goodLang input outputFolder/");
            return;
        }

        String in = args[0];
        String out = args[1] + args[0].split("/")[args[0].split("/").length - 1] + ".c";

        try {
            new Translator(new FileInputStream(in), new PrintWriter(out)).translateProgram();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void translateProgram() {

        try {
            ANTLRInputStream antlrInput = new ANTLRInputStream(input);
            GoodLangLexer lexer = new GoodLangLexer(antlrInput);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GoodLangParser parser = new GoodLangParser(tokens);
            root = parser.program();
            translateRoot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void translateRoot() {
        writeln("#include<stdio.h> \n");

        getFunctionDeclarations();

        writeln("int main(int argc, char *argv[]) {");

        ++indents;
        root.accept(new ExecutableCodeGenerator());
        writeln("return 0;");
        --indents;

        writeln("}");
        output.flush();
    }

    private void getFunctionDeclarations() {
        root.accept(new GoodLangBaseVisitor<Void>() {
            @Override
            public Void visitDeclaration(GoodLangParser.DeclarationContext ctx) {
                writeln(getFunctionDeclaration(ctx));
                writeln("{");
                ++indents;
                ExecutableCodeGenerator generator = new ExecutableCodeGenerator();
                ctx.body().accept(generator);
                if (!generator.returnStatementVisited)
                    writeln("return 0;");
                --indents;
                writeln("}");
                return null;
            }

        });
    }

    private String getFunctionDeclaration(GoodLangParser.DeclarationContext ctx) {
        String name = ctx.getTokens(GoodLangParser.ID).get(0).getText();
        List<String> args = getNames(ctx.lvalblock());
        return "int " + name + "(" + splitted(args.stream().map(arg -> "int " + arg).collect(Collectors.toList()), ", ") + ")";
    }


    private class ExecutableCodeGenerator extends GoodLangBaseVisitor<Void> {
        boolean returnStatementVisited;

        public ExecutableCodeGenerator() {
            super();
            returnStatementVisited = false;
        }

        @Override
        public Void visitAssignment(GoodLangParser.AssignmentContext ctx) {

            List<String> lvalues = getNames(ctx.lvalblock());
            String rvalue = ctx.rval().getText();


            for (String l : lvalues) {
                assignSingleVar(l, rvalue);
            }
            return null;
        }

        @Override
        public Void visitFunctionCall(GoodLangParser.FunctionCallContext ctx) {
            writeln(ctx.getText() + ";");
            return null;
        }

        @Override
        public Void visitLoopWhile(GoodLangParser.LoopWhileContext ctx) {
            writeln("while (" + ctx.boolExpression().getText() + ") {");
            ++indents;
            visitBody(ctx.body());
            --indents;
            writeln("}");
            return null;
        }

        @Override
        public Void visitConditional(GoodLangParser.ConditionalContext ctx) {
            writeln("if (" + ctx.boolExpression().getText() + ") {");
            ++indents;
            visitBody(ctx.body(0));
            --indents;
            GoodLangParser.BodyContext el = ctx.body(1);
            if (el == null)
                writeln("}");
            else {
                writeln("} else {");
                ++indents;
                visitBody(ctx.body(1));
                --indents;
                writeln("}");
            }
            return null;
        }

        @Override
        public Void visitLoopFor(GoodLangParser.LoopForContext ctx) {
            String name = ctx.lval().getText();

            StringBuilder sb = new StringBuilder();
            sb.append("for (int ");
            sb.append(makeAssignment(name, ctx.rval(0).getText()));
            sb.append(" " + name + " < " + ctx.rval(1).getText() + "; ++" + name + ") {");
            writeln(sb.toString());
            ++indents;
            visitBody(ctx.body());
            --indents;
            writeln("}");
            return null;
        }

        @Override
        public Void visitWriteOperator(GoodLangParser.WriteOperatorContext ctx) {
            List<GoodLangParser.WritableContext> args = ctx.writable();
            StringBuilder sb = new StringBuilder();

            sb.append("printf(\"");

            List<String> rvalues = new ArrayList<>();

            for (GoodLangParser.WritableContext i : args) {
                if (i.string() != null) {
                    sb.append("%s");
                    rvalues.add(i.getText());
                } else {
                    sb.append("%d");
                    rvalues.add(i.getText());
                }
            }

            sb.append("\\n\"");

            if (rvalues.size() > 0) {
                sb.append(", ");
                sb.append(splitted(rvalues, ", "));
            }
            sb.append(");");
            writeln(sb.toString());
            return null;
        }

        @Override
        public Void visitReadOperator(GoodLangParser.ReadOperatorContext ctx) {
            List<String> args = getNames(ctx.lvalblock());

            StringBuilder sb = new StringBuilder();
            sb.append("scanf(\"");
            for (int i = 0; i < args.size(); ++i)
                sb.append("%d");
            sb.append("\", ");
            List<String> addresses = args.stream().map(a -> "&" + a).collect(Collectors.toList());

            sb.append(splitted(addresses, ", "));
            sb.append(");");
            writeln(sb.toString());
            return null;
        }

        @Override
        public Void visitExpression(GoodLangParser.ExpressionContext ctx) {
            writeln(ctx.getText());
            return null;
        }

        @Override
        public Void visitDeclaration(GoodLangParser.DeclarationContext ctx) {
            return null;
        }

        @Override
        public Void visitReturnStatement(GoodLangParser.ReturnStatementContext ctx) {
            returnStatementVisited = true;
            String rval = "0";
            if (ctx.rval() != null)
                rval = ctx.rval().getText();

            writeln("return " + rval + ";");
            return null;
        }

        @Override
        public Void visitVariableDeclaration(GoodLangParser.VariableDeclarationContext ctx) {
            List<String> names;
            String value = "0";

            if (ctx.lvalblock() != null)
                names = getNames(ctx.lvalblock());
            else {
                names = getNames(ctx.assignment().lvalblock());
                value = ctx.assignment().rval().getText();
            }

            names = names.stream().map(n -> "int " + n).collect(Collectors.toList());
            assignVars(names, value);

            return null;
        }

        @Override
        public Void visitSwap(GoodLangParser.SwapContext ctx) {
            String temp = "a_" + Math.abs(new Random().nextInt());
            String a = ctx.lval(0).getText();
            String b = ctx.lval(1).getText();

            writeln("int " + temp + " = " + a + ";");
            writeln(a + " = " + b + ";");
            writeln(b + " = " + temp + ";");
            return null;
        }
    }


    public List<String> getNames(GoodLangParser.LvalblockContext context) {
        List<String> result = new ArrayList<>();
        context.accept(new GoodLangBaseVisitor<Void>() {
            @Override
            public Void visitLval(GoodLangParser.LvalContext ctx) {
                result.add(ctx.getText());
                return null;
            }
        });
        return result;
    }

    public List<String> getNames(GoodLangParser.RvalblockContext context) {
        List<String> result = new ArrayList<>();
        context.accept(new GoodLangBaseVisitor<Void>() {
            @Override
            public Void visitRval(GoodLangParser.RvalContext ctx) {
                result.add(ctx.getText());
                return null;
            }
        });
        return result;
    }


/*------------------------------------------------------------------
 * Translation Utils
*------------------------------------------------------------------*/

    private String splitted(List<String> items, String separator) {
        if (items.isEmpty())
            return "";
        else {
            StringBuilder sb = new StringBuilder();
            sb.append(items.get(0));
            for (int i = 1; i < items.size(); ++i) {
                sb.append(separator + items.get(i));
            }
            return sb.toString();
        }
    }


    private void writeln(String s) {
        for (int i = 0; i < indents; ++i) {
            output.write("\t");
        }
        output.write(s + "\n");
    }

    private void assignVars(List<String> names, String value) {
        for (String var : names) {
            writeln(makeAssignment(var, value));
        }
    }

    // todo no need?
    private void assignSingleVar(String name, String value) {
        writeln(makeAssignment(name, value));
    }

    private void declareVar(String name, String initialValue) {
        //declaredVars.add(name);
        writeln(makeVarDeclaration(name, initialValue));
    }

    private String makeVarDeclaration(String name, String value) {
        return "int " + name + " = " + value + ";";
    }

    private String makeAssignment(String name, String value) {
        return name + " = " + value + ";";
    }
}