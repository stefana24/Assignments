import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[]args){
        int[]arr = {2,13,45,46,7,6,89};
        int[]duplicatedArray = {2,3,2,4,5,3,55};
        String[]firstString = {"lemon","home","tea","billy"};
        String[]secondString = {"orange","lemon","tree","audio","home"};
        System.out.println("Second min element: "+secondMin(arr));
        int[]arrInsert = insertOnPosition(arr,3,27);
        System.out.println("After insertion:");
        printArray(arrInsert);
        displayMinMax(arrInsert);

        arrInsert = invertArray(arrInsert);
        printArray(arrInsert);

        findDuplicates(duplicatedArray);

        displayCommonElements(firstString,secondString);

        System.out.println("\nBefore sorting: ");
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }

    private static void printArray(int[]arr){
        for(int item:arr)
            System.out.print(item+" ");
        System.out.println();
    }

    //Creati o metoda care sa returneze al doilea cel mai mic numar dintr-un array.
    private static int secondMin(int[]arr){
        if(arr.length<2){
            System.out.println("The given array does not contain at least 2 elements");
            return -1;
        }else{
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            for(int i=0;i< arr.length;i++){
                if(min1>arr[i]){
                    min2 = min1;
                    min1 = arr[i];
                }
                if(min1<arr[i] && arr[i]<min2){
                    min2 = arr[i];
                }
            }
            return min2;
        }
    }

    //Creati o metoda care insereze un element pe o pozitie specifica intr-un array.
    private static int[] insertOnPosition(int[]arr,int pos,int elem){
        int[]newArr = new int[arr.length+1];
        for(int j= arr.length;j>pos;j--){
            newArr[j] = arr[j-1];
        }
        newArr[pos] = elem;

        for(int i=0;i<pos;i++){
            newArr[i] = arr[i];
        }

        return newArr;
    }

    //Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array
    private static void displayMinMax(int[]arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int item:arr){
            if(item<min){
                min = item;
            }
            if(item>max){
                max = item;
            }
        }

        System.out.println("Max value: "+max);
        System.out.println("Min value: "+min);
    }

    //Creati o metoda care sa inverseze valorile unui array de int-uri
    private static int[] invertArray(int[]arr){
        int[]copyArray = new int[arr.length];
        int index = arr.length-1;
        for(int i = 0;i< arr.length;i++){
            copyArray[i] = arr[index--];
        }
        return copyArray;

    }

    //Creati o metoda care sa gaseasca toate valorile duplicate dintr-un array.
    private static void findDuplicates(int[]arr){
        HashSet<Integer> set = new HashSet<>();
        System.out.println("The following elements are duplicated:");
        for(Integer item:arr){
            if(set.add(item)==false){
                System.out.print(item+" ");
            }
        }
    }

    //Creati o metoda care sa gaseasca toate elementele comune intre doua array-uri (array de String).
    private static void displayCommonElements(String[]str1,String[]str2){
        System.out.println("\nO(n^2) time complexity:");
        for(int i=0;i< str1.length;i++){
            for(int j=0;j< str2.length;j++){
                if(str1[i].equals(str2[j])){
                    System.out.print(str1[i]+" ");
                }
            }
        }

        System.out.println("\nO(n) using hashset");
        HashSet<String> hs1 = new HashSet<>();
        for(String string: str1){
            hs1.add(string);
        }

        for(String string: str2){
            if(hs1.add(string)==false){
                System.out.print(string+" ");
            }
        }
    }

    //Creati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator
    private static void bubbleSort(int[]arr){
        System.out.println("Sorting using bubble sort:");
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
}
