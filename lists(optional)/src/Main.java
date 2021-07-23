import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<Integer> list = new ArrayList<>();
        populateList(list);
        displayElements(list);
        changePosition(list,5,45);
        displayElements(list);

        List<Integer> evenList = onlyEven(list);
        displayElements(evenList);

        List<Integer>sortedL = sortedList(list);
        displayElements(sortedL);


    }

    private static void populateList(List<Integer> list){
        list.add(5);
        list.add(2);
        list.add(45);
        list.add(7);
        list.add(42);
        list.add(78);
    }
    private static void displayElements(List<Integer> list){
        for(Integer item:list)
            System.out.print(item+" ");
        System.out.println();
    }

    private static void changePosition(List<Integer> list,Integer elem1,Integer elem2){
        if(list.contains(elem1)&& list.contains(elem2)){
            int idx1 = list.indexOf(elem1);
            int idx2 = list.indexOf(elem2);

            list.remove(elem1);
            list.remove(elem2);
            list.add(idx1,elem2);
            list.add(idx2,elem1);

        }else{
            System.out.println("Elements not in list");
        }
    }

    private static List<Integer> onlyEven(List<Integer>list){
        List<Integer>evenNumbers = new ArrayList<>();
        for(Integer item:list){
            if(item%2==0)
                evenNumbers.add(item);
        }
        return evenNumbers;
    }

    private static List<Integer> sortedList(List<Integer>myList){
        List<Integer> sortList = new ArrayList<>();
        //copy the original list, because it is pass by reference
        List<Integer> copyList = new ArrayList<>(myList);
        for(int i=0;i< myList.size();i++){
            Integer min = findMin(copyList);
            sortList.add(min);
            copyList.remove(min);
        }
        return sortList;

    }

    private static Integer findMin(List<Integer>myList){
        Integer min = Integer.MAX_VALUE;
        for(Integer item:myList){
            if(item<min)
                min = item;
        }
        return min;
    }
}
