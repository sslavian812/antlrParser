// Generated from src/ru/ifmo/ctddev/shalamov/goodLang/GoodLang.g4 by ANTLR 4.5
package ru.ifmo.ctddev.shalamov.goodLang;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GoodLangParser}.
 */
public interface GoodLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GoodLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GoodLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GoodLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GoodLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GoodLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GoodLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GoodLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GoodLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(GoodLangParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(GoodLangParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#loopWhile}.
	 * @param ctx the parse tree
	 */
	void enterLoopWhile(GoodLangParser.LoopWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#loopWhile}.
	 * @param ctx the parse tree
	 */
	void exitLoopWhile(GoodLangParser.LoopWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#loopFor}.
	 * @param ctx the parse tree
	 */
	void enterLoopFor(GoodLangParser.LoopForContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#loopFor}.
	 * @param ctx the parse tree
	 */
	void exitLoopFor(GoodLangParser.LoopForContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#writeOperator}.
	 * @param ctx the parse tree
	 */
	void enterWriteOperator(GoodLangParser.WriteOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#writeOperator}.
	 * @param ctx the parse tree
	 */
	void exitWriteOperator(GoodLangParser.WriteOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#readOperator}.
	 * @param ctx the parse tree
	 */
	void enterReadOperator(GoodLangParser.ReadOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#readOperator}.
	 * @param ctx the parse tree
	 */
	void exitReadOperator(GoodLangParser.ReadOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GoodLangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GoodLangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(GoodLangParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(GoodLangParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(GoodLangParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(GoodLangParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#swap}.
	 * @param ctx the parse tree
	 */
	void enterSwap(GoodLangParser.SwapContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#swap}.
	 * @param ctx the parse tree
	 */
	void exitSwap(GoodLangParser.SwapContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#lvalblock}.
	 * @param ctx the parse tree
	 */
	void enterLvalblock(GoodLangParser.LvalblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#lvalblock}.
	 * @param ctx the parse tree
	 */
	void exitLvalblock(GoodLangParser.LvalblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#lval}.
	 * @param ctx the parse tree
	 */
	void enterLval(GoodLangParser.LvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#lval}.
	 * @param ctx the parse tree
	 */
	void exitLval(GoodLangParser.LvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#rvalblock}.
	 * @param ctx the parse tree
	 */
	void enterRvalblock(GoodLangParser.RvalblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#rvalblock}.
	 * @param ctx the parse tree
	 */
	void exitRvalblock(GoodLangParser.RvalblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#rval}.
	 * @param ctx the parse tree
	 */
	void enterRval(GoodLangParser.RvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#rval}.
	 * @param ctx the parse tree
	 */
	void exitRval(GoodLangParser.RvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(GoodLangParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(GoodLangParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#writable}.
	 * @param ctx the parse tree
	 */
	void enterWritable(GoodLangParser.WritableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#writable}.
	 * @param ctx the parse tree
	 */
	void exitWritable(GoodLangParser.WritableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GoodLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GoodLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GoodLangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GoodLangParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(GoodLangParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(GoodLangParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(GoodLangParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(GoodLangParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#boolTerm}.
	 * @param ctx the parse tree
	 */
	void enterBoolTerm(GoodLangParser.BoolTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#boolTerm}.
	 * @param ctx the parse tree
	 */
	void exitBoolTerm(GoodLangParser.BoolTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#boolAtom}.
	 * @param ctx the parse tree
	 */
	void enterBoolAtom(GoodLangParser.BoolAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#boolAtom}.
	 * @param ctx the parse tree
	 */
	void exitBoolAtom(GoodLangParser.BoolAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(GoodLangParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(GoodLangParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(GoodLangParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(GoodLangParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#boolConst}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(GoodLangParser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#boolConst}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(GoodLangParser.BoolConstContext ctx);
}