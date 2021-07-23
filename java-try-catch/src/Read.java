import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {

    private Scanner scanner = new Scanner(System.in);

    public int returnInt(){
        int number=0;
        try{
            System.out.println("Please enter a number(int): ");
            number = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Not an int");
        }
        return number;

    }
    public double returnDouble(){
        double number=0.0;
        try{
            System.out.println("Please enter a number(double): ");
            number = scanner.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("Not a double");
        }
        return number;

    }

    public String returnFromConsole() {
        String text = "";
        try {
            System.out.println("Please enter text: ");
            text = scanner.nextLine();

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return text;
    }

    //Ex 3
    //In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura. Metoda sa primeasca ca si parametru un numar,
    // care reprezinta cate pozitii are.
    public int[] displayArr(int elems){
        int[] arr = new int[elems];
        for(int i=0;i<elems;i++){
            System.out.println("Please enter element "+ (i+1)+": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    //Ex 4
    //In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura. Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
    // (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)

    public List<Integer> displayNumbersArr(){
        List<Integer> list = new ArrayList<>();
        boolean stop = false;
        while(!stop){
            try{
                System.out.println("\nPlease enter something: ");
                String str = scanner.nextLine();
                list.add(Integer.parseInt(str));
            }catch(NumberFormatException  e){
                stop = true;
                e.printStackTrace();
            }
        }

        return list;
    }

}
