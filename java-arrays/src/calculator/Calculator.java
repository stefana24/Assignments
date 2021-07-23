package calculator;

public class Calculator {
    //compile time polymorphism
    public void addition(int a,int b){
        System.out.println("Result of addition: "+(a+b));
    }
    public void addition(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public int subtraction(int a,int b){
        return a-b;
    }
    public double subtraction(double a,double b){
        return a-b;
    }

    public void multiplication(int a,int b){
        System.out.println(a*b);
    }
    public void multiplication(int a,int b,int c){
        System.out.println(a*b*c);
    }

    public int division(int a,int b){
        return a/b;
    }
    public double division(double a,double b){
        return a/b;
    }


}
