package ro.redeul.google.go.lang.psi.impl.expressions.binary;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import ro.redeul.google.go.lang.psi.expressions.GoExpr;
import ro.redeul.google.go.lang.psi.expressions.binary.GoMultiplicativeExpression;
import ro.redeul.google.go.lang.psi.typing.GoType;

public class GoMultiplicativeExpressionImpl extends GoBinaryExpressionImpl
    implements GoMultiplicativeExpression {

    public GoMultiplicativeExpressionImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    protected GoType[] resolveTypes() {
        GoExpr operand = getLeftOperand();
        return operand != null ? operand.getType() : GoType.EMPTY_ARRAY;
    }
}
