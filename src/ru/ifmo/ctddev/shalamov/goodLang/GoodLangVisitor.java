// Generated from src/ru/ifmo/ctddev/shalamov/goodLang/GoodLang.g4 by ANTLR 4.5
package ru.ifmo.ctddev.shalamov.goodLang;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GoodLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GoodLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GoodLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GoodLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(GoodLangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GoodLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(GoodLangParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#loopWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopWhile(GoodLangParser.LoopWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#loopFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopFor(GoodLangParser.LoopForContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#writeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteOperator(GoodLangParser.WriteOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#readOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadOperator(GoodLangParser.ReadOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GoodLangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(GoodLangParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(GoodLangParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#swap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwap(GoodLangParser.SwapContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#lvalblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalblock(GoodLangParser.LvalblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#lval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLval(GoodLangParser.LvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#rvalblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalblock(GoodLangParser.RvalblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#rval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRval(GoodLangParser.RvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(GoodLangParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#writable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritable(GoodLangParser.WritableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GoodLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GoodLangParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(GoodLangParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(GoodLangParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#boolTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTerm(GoodLangParser.BoolTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#boolAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAtom(GoodLangParser.BoolAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(GoodLangParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(GoodLangParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#boolConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConst(GoodLangParser.BoolConstContext ctx);
}