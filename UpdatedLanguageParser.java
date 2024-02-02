// Generated from UpdatedLanguage.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UpdatedLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, BinaryOperator=6, IDENTIFIER=7, 
		INT_LITERAL=8, FILE=9, OPEN=10, READ=11, WRITE=12, CLOSE=13, PRINT=14, 
		FOR=15, WHILE=16, IF=17, ELSE=18, FILENAME=19, WHITESPACE=20;
	public static final int
		RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_conditional = 4, RULE_loop = 5, RULE_functionCall = 6, RULE_argumentList = 7, 
		RULE_fileStatement = 8, RULE_fileFunctionCall = 9, RULE_fileDeclaration = 10, 
		RULE_fileRef = 11, RULE_printStatement = 12, RULE_expression = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statementList", "statement", "assignment", "conditional", 
			"loop", "functionCall", "argumentList", "fileStatement", "fileFunctionCall", 
			"fileDeclaration", "fileRef", "printStatement", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "','", null, null, null, "'file'", 
			"'open'", "'read'", "'write'", "'close'", "'print'", "'for'", "'while'", 
			"'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "BinaryOperator", "IDENTIFIER", "INT_LITERAL", 
			"FILE", "OPEN", "READ", "WRITE", "CLOSE", "PRINT", "FOR", "WHILE", "IF", 
			"ELSE", "FILENAME", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "UpdatedLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UpdatedLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			statementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					statement();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FileStatementContext fileStatement() {
			return getRuleContext(FileStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				assignment();
				setState(37);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				conditional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				functionCall();
				setState(42);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				fileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				printStatement();
				setState(46);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UpdatedLanguageParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(IDENTIFIER);
			setState(51);
			match(T__1);
			setState(52);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(UpdatedLanguageParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(UpdatedLanguageParser.ELSE, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(IF);
			setState(55);
			match(T__2);
			setState(56);
			expression(0);
			setState(57);
			match(T__3);
			setState(58);
			statementList();
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(59);
				match(ELSE);
				setState(60);
				statementList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(UpdatedLanguageParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode FOR() { return getToken(UpdatedLanguageParser.FOR, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loop);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(WHILE);
				setState(64);
				match(T__2);
				setState(65);
				expression(0);
				setState(66);
				match(T__3);
				setState(67);
				statementList();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(FOR);
				setState(70);
				match(T__2);
				setState(71);
				assignment();
				setState(72);
				match(T__0);
				setState(73);
				expression(0);
				setState(74);
				match(T__0);
				setState(75);
				assignment();
				setState(76);
				match(T__3);
				setState(77);
				statementList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UpdatedLanguageParser.IDENTIFIER, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IDENTIFIER);
			setState(82);
			match(T__2);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << IDENTIFIER) | (1L << INT_LITERAL))) != 0)) {
				{
				setState(83);
				argumentList();
				}
			}

			setState(86);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			expression(0);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(89);
				match(T__4);
				setState(90);
				expression(0);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileStatementContext extends ParserRuleContext {
		public FileDeclarationContext fileDeclaration() {
			return getRuleContext(FileDeclarationContext.class,0);
		}
		public FileFunctionCallContext fileFunctionCall() {
			return getRuleContext(FileFunctionCallContext.class,0);
		}
		public FileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).enterFileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).exitFileStatement(this);
		}
	}

	public final FileStatementContext fileStatement() throws RecognitionException {
		FileStatementContext _localctx = new FileStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fileStatement);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				fileDeclaration();
				}
				break;
			case OPEN:
			case READ:
			case WRITE:
			case CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				fileFunctionCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFunctionCallContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UpdatedLanguageParser.OPEN, 0); }
		public TerminalNode FILENAME() { return getToken(UpdatedLanguageParser.FILENAME, 0); }
		public TerminalNode READ() { return getToken(UpdatedLanguageParser.READ, 0); }
		public FileRefContext fileRef() {
			return getRuleContext(FileRefContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(UpdatedLanguageParser.WRITE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(UpdatedLanguageParser.CLOSE, 0); }
		public FileFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).enterFileFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).exitFileFunctionCall(this);
		}
	}

	public final FileFunctionCallContext fileFunctionCall() throws RecognitionException {
		FileFunctionCallContext _localctx = new FileFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fileFunctionCall);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(OPEN);
				setState(101);
				match(T__2);
				setState(102);
				match(FILENAME);
				setState(103);
				match(T__3);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(READ);
				setState(105);
				match(T__2);
				setState(106);
				fileRef();
				setState(107);
				match(T__3);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(WRITE);
				setState(110);
				match(T__2);
				setState(111);
				fileRef();
				setState(112);
				match(T__4);
				setState(113);
				expression(0);
				setState(114);
				match(T__3);
				}
				break;
			case CLOSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(CLOSE);
				setState(117);
				match(T__2);
				setState(118);
				fileRef();
				setState(119);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileDeclarationContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(UpdatedLanguageParser.FILE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UpdatedLanguageParser.IDENTIFIER, 0); }
		public TerminalNode OPEN() { return getToken(UpdatedLanguageParser.OPEN, 0); }
		public TerminalNode FILENAME() { return getToken(UpdatedLanguageParser.FILENAME, 0); }
		public FileDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).enterFileDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).exitFileDeclaration(this);
		}
	}

	public final FileDeclarationContext fileDeclaration() throws RecognitionException {
		FileDeclarationContext _localctx = new FileDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fileDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(FILE);
			setState(124);
			match(IDENTIFIER);
			setState(125);
			match(T__1);
			setState(126);
			match(OPEN);
			setState(127);
			match(T__2);
			setState(128);
			match(FILENAME);
			setState(129);
			match(T__3);
			setState(130);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileRefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UpdatedLanguageParser.IDENTIFIER, 0); }
		public FileRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).enterFileRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).exitFileRef(this);
		}
	}

	public final FileRefContext fileRef() throws RecognitionException {
		FileRefContext _localctx = new FileRefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fileRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(UpdatedLanguageParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(PRINT);
			setState(135);
			match(T__2);
			setState(136);
			expression(0);
			setState(137);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(UpdatedLanguageParser.INT_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UpdatedLanguageParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BinaryOperator() { return getToken(UpdatedLanguageParser.BinaryOperator, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UpdatedLanguageListener ) ((UpdatedLanguageListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				{
				setState(140);
				match(INT_LITERAL);
				}
				break;
			case IDENTIFIER:
				{
				setState(141);
				match(IDENTIFIER);
				}
				break;
			case T__2:
				{
				setState(142);
				match(T__2);
				setState(143);
				expression(0);
				setState(144);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(148);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(149);
					match(BinaryOperator);
					setState(150);
					expression(3);
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u009f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\7\3\"\n\3\f\3\16"+
		"\3%\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7R\n\7\3\b\3\b\3\b\5"+
		"\bW\n\b\3\b\3\b\3\t\3\t\3\t\7\t^\n\t\f\t\16\ta\13\t\3\n\3\n\5\ne\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13|\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0095\n\17\3\17\3\17\3\17\7\17\u009a\n\17\f\17\16\17\u009d"+
		"\13\17\3\17\2\3\34\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u00a1"+
		"\2\36\3\2\2\2\4#\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\n8\3\2\2\2\fQ\3\2\2"+
		"\2\16S\3\2\2\2\20Z\3\2\2\2\22d\3\2\2\2\24{\3\2\2\2\26}\3\2\2\2\30\u0086"+
		"\3\2\2\2\32\u0088\3\2\2\2\34\u0094\3\2\2\2\36\37\5\4\3\2\37\3\3\2\2\2"+
		" \"\5\6\4\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2\2\2%#\3\2"+
		"\2\2&\'\5\b\5\2\'(\7\3\2\2(\63\3\2\2\2)\63\5\n\6\2*\63\5\f\7\2+,\5\16"+
		"\b\2,-\7\3\2\2-\63\3\2\2\2.\63\5\22\n\2/\60\5\32\16\2\60\61\7\3\2\2\61"+
		"\63\3\2\2\2\62&\3\2\2\2\62)\3\2\2\2\62*\3\2\2\2\62+\3\2\2\2\62.\3\2\2"+
		"\2\62/\3\2\2\2\63\7\3\2\2\2\64\65\7\t\2\2\65\66\7\4\2\2\66\67\5\34\17"+
		"\2\67\t\3\2\2\289\7\23\2\29:\7\5\2\2:;\5\34\17\2;<\7\6\2\2<?\5\4\3\2="+
		">\7\24\2\2>@\5\4\3\2?=\3\2\2\2?@\3\2\2\2@\13\3\2\2\2AB\7\22\2\2BC\7\5"+
		"\2\2CD\5\34\17\2DE\7\6\2\2EF\5\4\3\2FR\3\2\2\2GH\7\21\2\2HI\7\5\2\2IJ"+
		"\5\b\5\2JK\7\3\2\2KL\5\34\17\2LM\7\3\2\2MN\5\b\5\2NO\7\6\2\2OP\5\4\3\2"+
		"PR\3\2\2\2QA\3\2\2\2QG\3\2\2\2R\r\3\2\2\2ST\7\t\2\2TV\7\5\2\2UW\5\20\t"+
		"\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\6\2\2Y\17\3\2\2\2Z_\5\34\17\2[\\"+
		"\7\7\2\2\\^\5\34\17\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\21\3\2"+
		"\2\2a_\3\2\2\2be\5\26\f\2ce\5\24\13\2db\3\2\2\2dc\3\2\2\2e\23\3\2\2\2"+
		"fg\7\f\2\2gh\7\5\2\2hi\7\25\2\2i|\7\6\2\2jk\7\r\2\2kl\7\5\2\2lm\5\30\r"+
		"\2mn\7\6\2\2n|\3\2\2\2op\7\16\2\2pq\7\5\2\2qr\5\30\r\2rs\7\7\2\2st\5\34"+
		"\17\2tu\7\6\2\2u|\3\2\2\2vw\7\17\2\2wx\7\5\2\2xy\5\30\r\2yz\7\6\2\2z|"+
		"\3\2\2\2{f\3\2\2\2{j\3\2\2\2{o\3\2\2\2{v\3\2\2\2|\25\3\2\2\2}~\7\13\2"+
		"\2~\177\7\t\2\2\177\u0080\7\4\2\2\u0080\u0081\7\f\2\2\u0081\u0082\7\5"+
		"\2\2\u0082\u0083\7\25\2\2\u0083\u0084\7\6\2\2\u0084\u0085\7\3\2\2\u0085"+
		"\27\3\2\2\2\u0086\u0087\7\t\2\2\u0087\31\3\2\2\2\u0088\u0089\7\20\2\2"+
		"\u0089\u008a\7\5\2\2\u008a\u008b\5\34\17\2\u008b\u008c\7\6\2\2\u008c\33"+
		"\3\2\2\2\u008d\u008e\b\17\1\2\u008e\u0095\7\n\2\2\u008f\u0095\7\t\2\2"+
		"\u0090\u0091\7\5\2\2\u0091\u0092\5\34\17\2\u0092\u0093\7\6\2\2\u0093\u0095"+
		"\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0095"+
		"\u009b\3\2\2\2\u0096\u0097\f\4\2\2\u0097\u0098\7\b\2\2\u0098\u009a\5\34"+
		"\17\5\u0099\u0096\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\35\3\2\2\2\u009d\u009b\3\2\2\2\f#\62?QV_d{\u0094"+
		"\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}