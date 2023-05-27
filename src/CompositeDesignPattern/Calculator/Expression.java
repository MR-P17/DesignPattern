package CompositeDesignPattern.Calculator;

public class Expression implements ArithmeticExpression{
    ArithmeticExpression leftExp;
    ArithmeticExpression rightExp;
    Operater operater;

    public Expression(ArithmeticExpression leftExp, ArithmeticExpression rightExp, Operater operater) {
        this.leftExp = leftExp;
        this.rightExp = rightExp;
        this.operater = operater;
    }


    @Override
    public int evaluate() {
        int res = 0;
        switch (operater){
            case ADD:
                res = leftExp.evaluate() + rightExp.evaluate();
                break;
            case SUB:
                res = leftExp.evaluate() - rightExp.evaluate();
                break;
            case MUL:
                res = leftExp.evaluate() * rightExp.evaluate();
                break;
            case DIV:
                res = leftExp.evaluate() / rightExp.evaluate();
                break;
        }
        System.out.println("Result is: " + res);
        return res;
    }
}
