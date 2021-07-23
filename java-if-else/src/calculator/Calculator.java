package calculator;

public class Calculator{
    private double firstNumber;
    private double secondNumber;

    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void addition(){
        System.out.println("Result of addition: ");
        MathOperations add = ((a, b) -> a+b);
        System.out.println(calculate(firstNumber,secondNumber,add));
    }
    public void subtraction(){
        System.out.println("Result of subtraction:");
        MathOperations subtraction = ((a, b) -> a-b);
        System.out.println(calculate(firstNumber,secondNumber,subtraction));
    }

    public void multiplication(){
        System.out.println("Result of multiplication: ");
        MathOperations multiply = ((a, b) -> a*b);
        System.out.println(calculate(firstNumber,secondNumber,multiply));
    }

    public void division(){
        System.out.println("Result of division:");
        MathOperations div = ((a, b) -> a/b);
        System.out.println(calculate(firstNumber,secondNumber,div));
    }

    public double calculate(double a,double b, MathOperations op){
        return op.operation(a,b);
    }
}
