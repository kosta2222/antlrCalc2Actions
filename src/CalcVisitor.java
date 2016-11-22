// Generated from Calc.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#addSubExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(@NotNull CalcParser.AddSubExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#multDivExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivExpr(@NotNull CalcParser.MultDivExprContext ctx);
}