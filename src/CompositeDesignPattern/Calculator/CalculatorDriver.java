package CompositeDesignPattern.Calculator;

public class CalculatorDriver {
    public static void main(String[] args) {
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression three = new Number(3);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression rightEval = new Expression(three, seven, Operater.ADD);

        ArithmeticExpression finalExp = new Expression(two, rightEval, Operater.MUL);

        int result = finalExp.evaluate();
        System.out.println("Final result : "+ result);
    }
}
