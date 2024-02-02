// Generated from UpdatedLanguage.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UpdatedLanguageParser}.
 */
public interface UpdatedLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UpdatedLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(UpdatedLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpdatedLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(UpdatedLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpdatedLanguageParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(UpdatedLanguageParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpdatedLanguageParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(UpdatedLanguageParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpdatedLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(UpdatedLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpdatedLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(UpdatedLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpdatedLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(UpdatedLanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpdatedLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(UpdatedLanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpdatedLanguageParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(UpdatedLanguageParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpdatedLanguageParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(UpdatedLanguageParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpdatedLanguageParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(UpdatedLanguageParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpdatedLanguageParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(UpdatedLanguageParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpdatedLanguageParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(UpdatedLanguageParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpdatedLanguageParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(UpdatedLanguageParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpdatedLanguageParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(UpdatedLanguageParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpdatedLanguageParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(UpdatedLanguageParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpdatedLanguageParser#fileStatement}.
	 * @param ctx the parse tree
	 */
	void enterFileStatement(UpdatedLanguageParser.FileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpdatedLanguageParser#fileStatement}.
	 * @param ctx the parse tree
	 */
	void exitFileStatement(UpdatedLanguageParser.FileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpdatedLanguageParser#fileFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterFileFunctionCall(UpdatedLanguageParser.FileFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpdatedLanguageParser#fileFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitFileFunctionCall(UpdatedLanguageParser.FileFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpdatedLanguageParser#fileDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFileDeclaration(UpdatedLanguageParser.FileDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpdatedLanguageParser#fileDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFileDeclaration(UpdatedLanguageParser.FileDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpdatedLanguageParser#fileRef}.
	 * @param ctx the parse tree
	 */
	void enterFileRef(UpdatedLanguageParser.FileRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpdatedLanguageParser#fileRef}.
	 * @param ctx the parse tree
	 */
	void exitFileRef(UpdatedLanguageParser.FileRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpdatedLanguageParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(UpdatedLanguageParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpdatedLanguageParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(UpdatedLanguageParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpdatedLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(UpdatedLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpdatedLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(UpdatedLanguageParser.ExpressionContext ctx);
}