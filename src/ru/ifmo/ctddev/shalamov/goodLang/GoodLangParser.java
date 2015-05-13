// Generated from src/ru/ifmo/ctddev/shalamov/goodLang/GoodLang.g4 by ANTLR 4.5
package ru.ifmo.ctddev.shalamov.goodLang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoodLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LPAREN=6, RPAREN=7, LBRACE=8, 
		RBRACE=9, PLS=10, MNS=11, MLP=12, DIV=13, OR=14, AND=15, NOT=16, LESS=17, 
		LESSEQUAL=18, GREATER=19, GREATEREQUAL=20, EQUAL=21, NEQUAL=22, ASSIGN=23, 
		COMMA=24, RANGE=25, SHL=26, SHR=27, QUESTION=28, QUOTE=29, IF=30, ELSE=31, 
		WHILE=32, FOR=33, RET=34, FUN=35, VAL=36, SWAP=37, INTEGER=38, ID=39, 
		SEMICOLON=40, WHITESPACE=41, NEWLINE=42, NL=43, SHARP=44;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_assignment = 3, 
		RULE_conditional = 4, RULE_loopWhile = 5, RULE_loopFor = 6, RULE_writeOperator = 7, 
		RULE_readOperator = 8, RULE_functionCall = 9, RULE_variableDeclaration = 10, 
		RULE_returnStatement = 11, RULE_swap = 12, RULE_lvalblock = 13, RULE_lval = 14, 
		RULE_rvalblock = 15, RULE_rval = 16, RULE_body = 17, RULE_writable = 18, 
		RULE_expression = 19, RULE_term = 20, RULE_atom = 21, RULE_boolExpression = 22, 
		RULE_boolTerm = 23, RULE_boolAtom = 24, RULE_comparison = 25, RULE_string = 26, 
		RULE_boolConst = 27;
	public static final String[] ruleNames = {
		"program", "statement", "declaration", "assignment", "conditional", "loopWhile", 
		"loopFor", "writeOperator", "readOperator", "functionCall", "variableDeclaration", 
		"returnStatement", "swap", "lvalblock", "lval", "rvalblock", "rval", "body", 
		"writable", "expression", "term", "atom", "boolExpression", "boolTerm", 
		"boolAtom", "comparison", "string", "boolConst"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\r'", "':'", "'.'", "'true'", "'false'", "'('", "')'", "'{'", 
		"'}'", "'+'", "'-'", "'*'", "'/'", "'|'", "'&'", "'!'", "'<'", "'<='", 
		"'>'", "'>='", "'=='", null, "'='", "','", "'..'", "'<<'", "'>>'", "'?'", 
		"'\"'", "'if'", "'else'", "'while'", "'for'", "'ret'", "'fun'", "'val'", 
		"'swap'", null, null, "';'", null, null, "'\n'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"PLS", "MNS", "MLP", "DIV", "OR", "AND", "NOT", "LESS", "LESSEQUAL", "GREATER", 
		"GREATEREQUAL", "EQUAL", "NEQUAL", "ASSIGN", "COMMA", "RANGE", "SHL", 
		"SHR", "QUESTION", "QUOTE", "IF", "ELSE", "WHILE", "FOR", "RET", "FUN", 
		"VAL", "SWAP", "INTEGER", "ID", "SEMICOLON", "WHITESPACE", "NEWLINE", 
		"NL", "SHARP"
	};
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
	public String getGrammarFileName() { return "GoodLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GoodLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(58);
				switch (_input.LA(1)) {
				case FUN:
					{
					setState(56);
					declaration();
					}
					break;
				case SHL:
				case SHR:
				case IF:
				case WHILE:
				case FOR:
				case RET:
				case VAL:
				case SWAP:
				case ID:
					{
					setState(57);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHL) | (1L << SHR) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RET) | (1L << FUN) | (1L << VAL) | (1L << SWAP) | (1L << ID))) != 0) );
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
		public LoopWhileContext loopWhile() {
			return getRuleContext(LoopWhileContext.class,0);
		}
		public LoopForContext loopFor() {
			return getRuleContext(LoopForContext.class,0);
		}
		public WriteOperatorContext writeOperator() {
			return getRuleContext(WriteOperatorContext.class,0);
		}
		public ReadOperatorContext readOperator() {
			return getRuleContext(ReadOperatorContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SwapContext swap() {
			return getRuleContext(SwapContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GoodLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GoodLangParser.SEMICOLON, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(62);
				assignment();
				}
				break;
			case 2:
				{
				setState(63);
				conditional();
				}
				break;
			case 3:
				{
				setState(64);
				loopWhile();
				}
				break;
			case 4:
				{
				setState(65);
				loopFor();
				}
				break;
			case 5:
				{
				setState(66);
				writeOperator();
				}
				break;
			case 6:
				{
				setState(67);
				readOperator();
				}
				break;
			case 7:
				{
				setState(68);
				functionCall();
				}
				break;
			case 8:
				{
				setState(69);
				variableDeclaration();
				}
				break;
			case 9:
				{
				setState(70);
				returnStatement();
				}
				break;
			case 10:
				{
				setState(71);
				swap();
				}
				break;
			}
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					match(SEMICOLON);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(GoodLangParser.FUN, 0); }
		public TerminalNode ID() { return getToken(GoodLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GoodLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GoodLangParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LvalblockContext lvalblock() {
			return getRuleContext(LvalblockContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(FUN);
			setState(81);
			match(ID);
			setState(82);
			match(LPAREN);
			setState(84);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(83);
				lvalblock();
				}
			}

			setState(86);
			match(RPAREN);
			setState(87);
			body();
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
		public LvalblockContext lvalblock() {
			return getRuleContext(LvalblockContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GoodLangParser.ASSIGN, 0); }
		public RvalContext rval() {
			return getRuleContext(RvalContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			lvalblock();
			setState(90);
			match(ASSIGN);
			setState(91);
			rval();
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
		public TerminalNode IF() { return getToken(GoodLangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(GoodLangParser.LPAREN, 0); }
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GoodLangParser.RPAREN, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GoodLangParser.ELSE, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IF);
			setState(94);
			match(LPAREN);
			setState(95);
			boolExpression();
			setState(96);
			match(RPAREN);
			setState(97);
			body();
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(98);
				match(ELSE);
				setState(99);
				body();
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

	public static class LoopWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GoodLangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(GoodLangParser.LPAREN, 0); }
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GoodLangParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LoopWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterLoopWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitLoopWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitLoopWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopWhileContext loopWhile() throws RecognitionException {
		LoopWhileContext _localctx = new LoopWhileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(WHILE);
			setState(103);
			match(LPAREN);
			setState(104);
			boolExpression();
			setState(105);
			match(RPAREN);
			setState(106);
			body();
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

	public static class LoopForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GoodLangParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GoodLangParser.LPAREN, 0); }
		public LvalContext lval() {
			return getRuleContext(LvalContext.class,0);
		}
		public List<RvalContext> rval() {
			return getRuleContexts(RvalContext.class);
		}
		public RvalContext rval(int i) {
			return getRuleContext(RvalContext.class,i);
		}
		public TerminalNode RANGE() { return getToken(GoodLangParser.RANGE, 0); }
		public TerminalNode RPAREN() { return getToken(GoodLangParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LoopForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterLoopFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitLoopFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitLoopFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopForContext loopFor() throws RecognitionException {
		LoopForContext _localctx = new LoopForContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loopFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(FOR);
			setState(109);
			match(LPAREN);
			setState(110);
			lval();
			setState(111);
			rval();
			setState(112);
			match(RANGE);
			setState(113);
			rval();
			setState(114);
			match(RPAREN);
			setState(115);
			body();
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

	public static class WriteOperatorContext extends ParserRuleContext {
		public TerminalNode SHL() { return getToken(GoodLangParser.SHL, 0); }
		public List<WritableContext> writable() {
			return getRuleContexts(WritableContext.class);
		}
		public WritableContext writable(int i) {
			return getRuleContext(WritableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoodLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoodLangParser.COMMA, i);
		}
		public WriteOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterWriteOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitWriteOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitWriteOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteOperatorContext writeOperator() throws RecognitionException {
		WriteOperatorContext _localctx = new WriteOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_writeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(SHL);
			setState(118);
			writable();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(119);
				match(COMMA);
				setState(120);
				writable();
				}
				}
				setState(125);
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

	public static class ReadOperatorContext extends ParserRuleContext {
		public TerminalNode SHR() { return getToken(GoodLangParser.SHR, 0); }
		public LvalblockContext lvalblock() {
			return getRuleContext(LvalblockContext.class,0);
		}
		public ReadOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterReadOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitReadOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitReadOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadOperatorContext readOperator() throws RecognitionException {
		ReadOperatorContext _localctx = new ReadOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_readOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(SHR);
			setState(127);
			lvalblock();
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
		public TerminalNode ID() { return getToken(GoodLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GoodLangParser.LPAREN, 0); }
		public RvalblockContext rvalblock() {
			return getRuleContext(RvalblockContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GoodLangParser.RPAREN, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ID);
			setState(130);
			match(LPAREN);
			setState(131);
			rvalblock();
			setState(132);
			match(RPAREN);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(GoodLangParser.VAL, 0); }
		public LvalblockContext lvalblock() {
			return getRuleContext(LvalblockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(VAL);
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(135);
				lvalblock();
				}
				break;
			case 2:
				{
				setState(136);
				assignment();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(GoodLangParser.RET, 0); }
		public RvalContext rval() {
			return getRuleContext(RvalContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GoodLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GoodLangParser.SEMICOLON, i);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(RET);
			setState(140);
			rval();
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					match(SEMICOLON);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class SwapContext extends ParserRuleContext {
		public TerminalNode SWAP() { return getToken(GoodLangParser.SWAP, 0); }
		public List<LvalContext> lval() {
			return getRuleContexts(LvalContext.class);
		}
		public LvalContext lval(int i) {
			return getRuleContext(LvalContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(GoodLangParser.COMMA, 0); }
		public SwapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterSwap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitSwap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitSwap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwapContext swap() throws RecognitionException {
		SwapContext _localctx = new SwapContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_swap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(SWAP);
			setState(148);
			lval();
			setState(149);
			match(COMMA);
			setState(150);
			lval();
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

	public static class LvalblockContext extends ParserRuleContext {
		public List<LvalContext> lval() {
			return getRuleContexts(LvalContext.class);
		}
		public LvalContext lval(int i) {
			return getRuleContext(LvalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoodLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoodLangParser.COMMA, i);
		}
		public LvalblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterLvalblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitLvalblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitLvalblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalblockContext lvalblock() throws RecognitionException {
		LvalblockContext _localctx = new LvalblockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lvalblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			lval();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				lval();
				}
				}
				setState(159);
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

	public static class LvalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GoodLangParser.ID, 0); }
		public LvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterLval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitLval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitLval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalContext lval() throws RecognitionException {
		LvalContext _localctx = new LvalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ID);
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

	public static class RvalblockContext extends ParserRuleContext {
		public List<RvalContext> rval() {
			return getRuleContexts(RvalContext.class);
		}
		public RvalContext rval(int i) {
			return getRuleContext(RvalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoodLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoodLangParser.COMMA, i);
		}
		public RvalblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterRvalblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitRvalblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitRvalblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RvalblockContext rvalblock() throws RecognitionException {
		RvalblockContext _localctx = new RvalblockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rvalblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			rval();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(163);
				match(COMMA);
				setState(164);
				rval();
				}
				}
				setState(169);
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

	public static class RvalContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(GoodLangParser.QUESTION, 0); }
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public RvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterRval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitRval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitRval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RvalContext rval() throws RecognitionException {
		RvalContext _localctx = new RvalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rval);
		try {
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(QUESTION);
				setState(172);
				boolExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				functionCall();
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

	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(GoodLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GoodLangParser.RBRACE, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_body);
		int _la;
		try {
			setState(185);
			switch (_input.LA(1)) {
			case SHL:
			case SHR:
			case IF:
			case WHILE:
			case FOR:
			case RET:
			case VAL:
			case SWAP:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				statement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(LBRACE);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHL) | (1L << SHR) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RET) | (1L << VAL) | (1L << SWAP) | (1L << ID))) != 0)) {
					{
					{
					setState(178);
					statement();
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				match(RBRACE);
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

	public static class WritableContext extends ParserRuleContext {
		public RvalContext rval() {
			return getRuleContext(RvalContext.class,0);
		}
		public List<TerminalNode> QUOTE() { return getTokens(GoodLangParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(GoodLangParser.QUOTE, i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public WritableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterWritable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitWritable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitWritable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritableContext writable() throws RecognitionException {
		WritableContext _localctx = new WritableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_writable);
		try {
			setState(192);
			switch (_input.LA(1)) {
			case LPAREN:
			case PLS:
			case MNS:
			case QUESTION:
			case INTEGER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				rval();
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(QUOTE);
				setState(189);
				string();
				setState(190);
				match(QUOTE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLS() { return getTokens(GoodLangParser.PLS); }
		public TerminalNode PLS(int i) {
			return getToken(GoodLangParser.PLS, i);
		}
		public List<TerminalNode> MNS() { return getTokens(GoodLangParser.MNS); }
		public TerminalNode MNS(int i) {
			return getToken(GoodLangParser.MNS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if (_la==PLS || _la==MNS) {
				{
				setState(194);
				_la = _input.LA(1);
				if ( !(_la==PLS || _la==MNS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(197);
			term();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLS || _la==MNS) {
				{
				{
				setState(198);
				_la = _input.LA(1);
				if ( !(_la==PLS || _la==MNS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(199);
				term();
				}
				}
				setState(204);
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

	public static class TermContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> MLP() { return getTokens(GoodLangParser.MLP); }
		public TerminalNode MLP(int i) {
			return getToken(GoodLangParser.MLP, i);
		}
		public List<TerminalNode> DIV() { return getTokens(GoodLangParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(GoodLangParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			atom();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MLP || _la==DIV) {
				{
				{
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==MLP || _la==DIV) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(207);
				atom();
				}
				}
				setState(212);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GoodLangParser.INTEGER, 0); }
		public LvalContext lval() {
			return getRuleContext(LvalContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GoodLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GoodLangParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atom);
		try {
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				lval();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(LPAREN);
				setState(217);
				expression();
				setState(218);
				match(RPAREN);
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

	public static class BoolExpressionContext extends ParserRuleContext {
		public List<BoolTermContext> boolTerm() {
			return getRuleContexts(BoolTermContext.class);
		}
		public BoolTermContext boolTerm(int i) {
			return getRuleContext(BoolTermContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(GoodLangParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(GoodLangParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(GoodLangParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GoodLangParser.OR, i);
		}
		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boolExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			boolTerm();
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(223);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==AND) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(224);
					boolTerm();
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class BoolTermContext extends ParserRuleContext {
		public BoolAtomContext boolAtom() {
			return getRuleContext(BoolAtomContext.class,0);
		}
		public TerminalNode NOT() { return getToken(GoodLangParser.NOT, 0); }
		public BoolTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterBoolTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitBoolTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitBoolTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolTermContext boolTerm() throws RecognitionException {
		BoolTermContext _localctx = new BoolTermContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_boolTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(230);
				match(NOT);
				}
			}

			setState(233);
			boolAtom();
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

	public static class BoolAtomContext extends ParserRuleContext {
		public BoolConstContext boolConst() {
			return getRuleContext(BoolConstContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public RvalContext rval() {
			return getRuleContext(RvalContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GoodLangParser.LPAREN, 0); }
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GoodLangParser.RPAREN, 0); }
		public BoolAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterBoolAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitBoolAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitBoolAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolAtomContext boolAtom() throws RecognitionException {
		BoolAtomContext _localctx = new BoolAtomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_boolAtom);
		try {
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				boolConst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				comparison();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				rval();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				match(LPAREN);
				setState(239);
				boolExpression();
				setState(240);
				match(RPAREN);
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<RvalContext> rval() {
			return getRuleContexts(RvalContext.class);
		}
		public RvalContext rval(int i) {
			return getRuleContext(RvalContext.class,i);
		}
		public TerminalNode LESS() { return getToken(GoodLangParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(GoodLangParser.GREATER, 0); }
		public TerminalNode LESSEQUAL() { return getToken(GoodLangParser.LESSEQUAL, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(GoodLangParser.GREATEREQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(GoodLangParser.EQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(GoodLangParser.NEQUAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			rval();
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSEQUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << EQUAL) | (1L << NEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(246);
			rval();
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << PLS) | (1L << MNS) | (1L << MLP) | (1L << DIV) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << LESS) | (1L << LESSEQUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << EQUAL) | (1L << NEQUAL) | (1L << ASSIGN) | (1L << COMMA) | (1L << RANGE) | (1L << SHL) | (1L << SHR) | (1L << QUESTION) | (1L << IF) | (1L << ELSE) | (1L << WHILE) | (1L << FOR) | (1L << RET) | (1L << FUN) | (1L << VAL) | (1L << SWAP) | (1L << INTEGER) | (1L << ID) | (1L << SEMICOLON) | (1L << WHITESPACE) | (1L << NEWLINE) | (1L << SHARP))) != 0)) {
				{
				setState(251);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(248);
					_la = _input.LA(1);
					if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << QUOTE) | (1L << NL))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case 2:
					{
					setState(249);
					match(T__1);
					}
					break;
				case 3:
					{
					setState(250);
					match(T__2);
					}
					break;
				}
				}
				setState(255);
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

	public static class BoolConstContext extends ParserRuleContext {
		public BoolConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterBoolConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitBoolConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitBoolConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolConstContext boolConst() throws RecognitionException {
		BoolConstContext _localctx = new BoolConstContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_boolConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0105\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\6\2=\n\2\r\2\16\2>\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\3\7\3N\n\3\f\3\16\3"+
		"Q\13\3\3\4\3\4\3\4\3\4\5\4W\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t|\n\t\f\t\16\t\177\13\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r\3\r\7"+
		"\r\u0091\n\r\f\r\16\r\u0094\13\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\7\17\u009e\n\17\f\17\16\17\u00a1\13\17\3\20\3\20\3\21\3\21\3\21\7"+
		"\21\u00a8\n\21\f\21\16\21\u00ab\13\21\3\22\3\22\3\22\3\22\5\22\u00b1\n"+
		"\22\3\23\3\23\3\23\7\23\u00b6\n\23\f\23\16\23\u00b9\13\23\3\23\5\23\u00bc"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00c3\n\24\3\25\5\25\u00c6\n\25\3"+
		"\25\3\25\3\25\7\25\u00cb\n\25\f\25\16\25\u00ce\13\25\3\26\3\26\3\26\7"+
		"\26\u00d3\n\26\f\26\16\26\u00d6\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\5\27\u00df\n\27\3\30\3\30\3\30\7\30\u00e4\n\30\f\30\16\30\u00e7\13"+
		"\30\3\31\5\31\u00ea\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u00f5\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u00fe\n\34\f"+
		"\34\16\34\u0101\13\34\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668\2\b\3\2\f\r\3\2\16\17\3\2\20\21\3\2"+
		"\23\30\5\2\3\3\37\37--\3\2\6\7\u010e\2<\3\2\2\2\4J\3\2\2\2\6R\3\2\2\2"+
		"\b[\3\2\2\2\n_\3\2\2\2\fh\3\2\2\2\16n\3\2\2\2\20w\3\2\2\2\22\u0080\3\2"+
		"\2\2\24\u0083\3\2\2\2\26\u0088\3\2\2\2\30\u008d\3\2\2\2\32\u0095\3\2\2"+
		"\2\34\u009a\3\2\2\2\36\u00a2\3\2\2\2 \u00a4\3\2\2\2\"\u00b0\3\2\2\2$\u00bb"+
		"\3\2\2\2&\u00c2\3\2\2\2(\u00c5\3\2\2\2*\u00cf\3\2\2\2,\u00de\3\2\2\2."+
		"\u00e0\3\2\2\2\60\u00e9\3\2\2\2\62\u00f4\3\2\2\2\64\u00f6\3\2\2\2\66\u00ff"+
		"\3\2\2\28\u0102\3\2\2\2:=\5\6\4\2;=\5\4\3\2<:\3\2\2\2<;\3\2\2\2=>\3\2"+
		"\2\2><\3\2\2\2>?\3\2\2\2?\3\3\2\2\2@K\5\b\5\2AK\5\n\6\2BK\5\f\7\2CK\5"+
		"\16\b\2DK\5\20\t\2EK\5\22\n\2FK\5\24\13\2GK\5\26\f\2HK\5\30\r\2IK\5\32"+
		"\16\2J@\3\2\2\2JA\3\2\2\2JB\3\2\2\2JC\3\2\2\2JD\3\2\2\2JE\3\2\2\2JF\3"+
		"\2\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2KO\3\2\2\2LN\7*\2\2ML\3\2\2\2NQ\3"+
		"\2\2\2OM\3\2\2\2OP\3\2\2\2P\5\3\2\2\2QO\3\2\2\2RS\7%\2\2ST\7)\2\2TV\7"+
		"\b\2\2UW\5\34\17\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\t\2\2YZ\5$\23\2Z"+
		"\7\3\2\2\2[\\\5\34\17\2\\]\7\31\2\2]^\5\"\22\2^\t\3\2\2\2_`\7 \2\2`a\7"+
		"\b\2\2ab\5.\30\2bc\7\t\2\2cf\5$\23\2de\7!\2\2eg\5$\23\2fd\3\2\2\2fg\3"+
		"\2\2\2g\13\3\2\2\2hi\7\"\2\2ij\7\b\2\2jk\5.\30\2kl\7\t\2\2lm\5$\23\2m"+
		"\r\3\2\2\2no\7#\2\2op\7\b\2\2pq\5\36\20\2qr\5\"\22\2rs\7\33\2\2st\5\""+
		"\22\2tu\7\t\2\2uv\5$\23\2v\17\3\2\2\2wx\7\34\2\2x}\5&\24\2yz\7\32\2\2"+
		"z|\5&\24\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\21\3\2\2\2\177"+
		"}\3\2\2\2\u0080\u0081\7\35\2\2\u0081\u0082\5\34\17\2\u0082\23\3\2\2\2"+
		"\u0083\u0084\7)\2\2\u0084\u0085\7\b\2\2\u0085\u0086\5 \21\2\u0086\u0087"+
		"\7\t\2\2\u0087\25\3\2\2\2\u0088\u008b\7&\2\2\u0089\u008c\5\34\17\2\u008a"+
		"\u008c\5\b\5\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\27\3\2\2"+
		"\2\u008d\u008e\7$\2\2\u008e\u0092\5\"\22\2\u008f\u0091\7*\2\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\31\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\'\2\2\u0096\u0097\5\36\20"+
		"\2\u0097\u0098\7\32\2\2\u0098\u0099\5\36\20\2\u0099\33\3\2\2\2\u009a\u009f"+
		"\5\36\20\2\u009b\u009c\7\32\2\2\u009c\u009e\5\36\20\2\u009d\u009b\3\2"+
		"\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\35\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7)\2\2\u00a3\37\3\2\2\2\u00a4"+
		"\u00a9\5\"\22\2\u00a5\u00a6\7\32\2\2\u00a6\u00a8\5\"\22\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"!\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b1\5(\25\2\u00ad\u00ae\7\36\2\2"+
		"\u00ae\u00b1\5.\30\2\u00af\u00b1\5\24\13\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad"+
		"\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1#\3\2\2\2\u00b2\u00bc\5\4\3\2\u00b3"+
		"\u00b7\7\n\2\2\u00b4\u00b6\5\4\3\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bc\7\13\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b3\3"+
		"\2\2\2\u00bc%\3\2\2\2\u00bd\u00c3\5\"\22\2\u00be\u00bf\7\37\2\2\u00bf"+
		"\u00c0\5\66\34\2\u00c0\u00c1\7\37\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00bd"+
		"\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3\'\3\2\2\2\u00c4\u00c6\t\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cc\5*"+
		"\26\2\u00c8\u00c9\t\2\2\2\u00c9\u00cb\5*\26\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd)\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00cf\u00d4\5,\27\2\u00d0\u00d1\t\3\2\2\u00d1\u00d3"+
		"\5,\27\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5+\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00df\7(\2\2\u00d8"+
		"\u00df\5\36\20\2\u00d9\u00df\5\24\13\2\u00da\u00db\7\b\2\2\u00db\u00dc"+
		"\5(\25\2\u00dc\u00dd\7\t\2\2\u00dd\u00df\3\2\2\2\u00de\u00d7\3\2\2\2\u00de"+
		"\u00d8\3\2\2\2\u00de\u00d9\3\2\2\2\u00de\u00da\3\2\2\2\u00df-\3\2\2\2"+
		"\u00e0\u00e5\5\60\31\2\u00e1\u00e2\t\4\2\2\u00e2\u00e4\5\60\31\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6/\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\7\22\2\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\5\62\32\2"+
		"\u00ec\61\3\2\2\2\u00ed\u00f5\58\35\2\u00ee\u00f5\5\64\33\2\u00ef\u00f5"+
		"\5\"\22\2\u00f0\u00f1\7\b\2\2\u00f1\u00f2\5.\30\2\u00f2\u00f3\7\t\2\2"+
		"\u00f3\u00f5\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00ef"+
		"\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f5\63\3\2\2\2\u00f6\u00f7\5\"\22\2\u00f7"+
		"\u00f8\t\5\2\2\u00f8\u00f9\5\"\22\2\u00f9\65\3\2\2\2\u00fa\u00fe\n\6\2"+
		"\2\u00fb\u00fe\7\4\2\2\u00fc\u00fe\7\5\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\67\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\t\7\2"+
		"\2\u01039\3\2\2\2\32<>JOVf}\u008b\u0092\u009f\u00a9\u00b0\u00b7\u00bb"+
		"\u00c2\u00c5\u00cc\u00d4\u00de\u00e5\u00e9\u00f4\u00fd\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}