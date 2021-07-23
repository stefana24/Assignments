import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[]args) throws IOException {
        Read readObj = new Read();
        int valueInt = readObj.returnInt();
        System.out.println(valueInt);

        double valueDouble = readObj.returnDouble();
        System.out.println(valueDouble);

        //System.out.println(readObj.returnFromConsole());

        int[] arr = readObj.displayArr(5);
        for(int item:arr)
            System.out.print(item+" ");

        List<Integer> list = readObj.displayNumbersArr();

        LogicalOp op = new LogicalOp();
        int[] arr2 = {3,5,6,7,88};
        op.positionArr(arr2,6);

        op.wait(10);

    }
}
