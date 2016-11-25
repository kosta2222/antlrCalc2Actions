// Generated from Calc.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, INT=5, WS=6;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'*'", "'+'", "'-'", "INT", "WS"
	};
	public static final int
		RULE_multDivExpr = 0, RULE_addSubExpr = 1;
	public static final String[] ruleNames = {
		"multDivExpr", "addSubExpr"
	};

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MultDivExprContext extends ParserRuleContext {
		public TerminalNode INT(int i) {
			return getToken(CalcParser.INT, i);
		}
		public List<TerminalNode> INT() { return getTokens(CalcParser.INT); }
		public MultDivExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDivExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitMultDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultDivExprContext multDivExpr() throws RecognitionException {
		MultDivExprContext _localctx = new MultDivExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_multDivExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4); match(INT);
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==1 || _la==2) {
				{
				{
				setState(5);
				_la = _input.LA(1);
				if ( !(_la==1 || _la==2) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(6); match(INT);
				}
				}
				setState(11);
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

	public static class AddSubExprContext extends ParserRuleContext {
		public List<MultDivExprContext> multDivExpr() {
			return getRuleContexts(MultDivExprContext.class);
		}
		public MultDivExprContext multDivExpr(int i) {
			return getRuleContext(MultDivExprContext.class,i);
		}
		public AddSubExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubExprContext addSubExpr() throws RecognitionException {
		AddSubExprContext _localctx = new AddSubExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_addSubExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); multDivExpr();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3 || _la==4) {
				{
				{
				setState(13);
				_la = _input.LA(1);
				if ( !(_la==3 || _la==4) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(14); multDivExpr();
				}
				}
				setState(19);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b\27\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\3\3\3\3\3\7\3\22\n\3\f\3"+
		"\16\3\25\13\3\3\3\2\2\4\2\4\2\4\3\2\3\4\3\2\5\6\26\2\6\3\2\2\2\4\16\3"+
		"\2\2\2\6\13\7\7\2\2\7\b\t\2\2\2\b\n\7\7\2\2\t\7\3\2\2\2\n\r\3\2\2\2\13"+
		"\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\13\3\2\2\2\16\23\5\2\2\2\17\20\t"+
		"\3\2\2\20\22\5\2\2\2\21\17\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3"+
		"\2\2\2\24\5\3\2\2\2\25\23\3\2\2\2\4\13\23";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}