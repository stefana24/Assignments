import calculator.Calculator;
import logicalOp.LogicalOp;

public class Main {
    public static void main(String[]args){
//        Calculator calculator = new Calculator();
//        calculator.addition(2,3);
//        calculator.addition(2,3,4);
//        System.out.println(calculator.subtraction(4,5));
//        System.out.println(calculator.subtraction(4.56,5.89));
//        calculator.multiplication(4,5);
//        calculator.multiplication(4,5,3);
//        System.out.println(calculator.division(4,5));
//        System.out.println(calculator.division(4.0,5.0));

        int []arr = new int[100];
        int []arr2 = new int[50];
        int []arr3 = {1,2,3,4,5,6,7,8};
        int number = 5;
        LogicalOp op = new LogicalOp();
//        op.writeOnArray(arr);

//        arr2 = op.evenArray(arr2);
//        for(int i=0;i<arr2.length;i++)
//            System.out.println(arr2[i]);

        //System.out.println("Mean value: "+op.meanValue(arr3));

//        String[] arrOfStr = {"ana","are","mere","pere","mere"};
//        String str = "mere";
//        System.out.println(op.isContaingString(arrOfStr,str));

//        System.out.println(op.findPosition(arr3,number));

        //op.displayLines();

//        int[]modifArr = op.modifiedArr(arr3,number);
//        for(int item: modifArr)
//            System.out.print(item+" ");


        //System.out.println("Second minimum: "+op.secondMin(arr3));

        int[] empty = new int[arr3.length];
        empty = op.populateArray(arr3,empty);
        for(int item:empty)
            System.out.print(item+" ");



    }
}
