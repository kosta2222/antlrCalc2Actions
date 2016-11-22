// Generated from Calc.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;

/**
 * This class provides an empty implementation of {@link CalcVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class CalcBaseVisitorImpl extends CalcBaseVisitor<Integer>  {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAddSubExpr(@NotNull CalcParser.AddSubExprContext ctx) { 
//            return visitChildren(ctx); 
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMultDivExpr(@NotNull CalcParser.MultDivExprContext ctx) { 
            return visitChildren(ctx); 
       }
}