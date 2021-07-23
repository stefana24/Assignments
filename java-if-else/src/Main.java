import calculator.Calculator;
import logicalop.LogicalOp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

//        Calculator calculator = new Calculator(3,4);
//        calculator.addition();
//        calculator.subtraction();
//        calculator.division();
//        calculator.multiplication();

        LogicalOp op = new LogicalOp();
//        int biggest = op.checkBiggerNumber(2,3);

//        System.out.println("The biggest number: "+biggest);

//        System.out.println(op.compare("fastTrackIT"));

//        System.out.println(op.compare("FastTrackIT",2));
//        System.out.println(op.compare("FastTrackIT",5));
//        System.out.println(op.compare("fastTrackIT",2));
//        System.out.println(op.compare("fastTrackIT",4));

//        System.out.println(op.compareNumber(9));
//        System.out.println(op.compareNumber(5));

//        System.out.println(op.compareEx7(5));
//        System.out.println(op.compareEx7(4));
//        System.out.println(op.compareEx7(3));
//        System.out.println(op.compareEx7(2));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please insert a number:");
//        int pressedNumber = scanner.nextInt();
//        op.ex8(pressedNumber);

//        int x = 5;
//        System.out.println("Check parity for "+ x + ": "+ op.isNumberEven(x));

//        int age = 1;
//        System.out.println("if you are "+ age + " years old, you are eligible to vote:"+ op.isEligibleToVote(age));

        System.out.println("The largest number is: "+op.compareThreeNumbers(4,5.6,2.1));

    }

}
