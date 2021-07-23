import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static void populateIntList(List<Integer>myList){
        myList.add(5);
        myList.add(4);
        myList.add(16);
        myList.add(25);
        myList.add(17);

    }
    private static void displayElementsOfIntList(List<Integer> list){
        for(Integer item: list)
            System.out.println(item);
    }

    public static void main(String[]args){
        List<Integer> intNumbers  = new ArrayList<Integer>();
        populateIntList(intNumbers);
        //displayElementsOfIntList(intNumbers);

        List<Number> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4.5);
        numbers.add(7.8);
        //addToList(numbers,6);

        //displayStartingWith(intNumbers,16);

        //reverseList(intNumbers);

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("watermelon");
        addStringToGivenPosition(stringList,1,"cherry");
        addFirst(stringList,"pizza");
//        for(String element:stringList)
//            System.out.println(element);

        //displayElemAndPosition(intNumbers);
        
        System.out.println("Max elem of intNumbers list is: "+maximum(intNumbers));

    }

    private static void addToList(List<Number>list,Number elem){
        list.add(elem);
        for(Number item:list)
            System.out.println(item);
    }

    private static void displayStartingWith(List<Integer>list,int elem){
        if(!list.contains(elem)){
            System.out.println("The element: "+elem+" is not found in list");
        }else{
            int start = list.indexOf(elem);
            for(int i=start;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
    }

    private static void reverseList(List<Integer>list){
        for(int i= list.size()-1;i>=0;i--)
            System.out.println(list.get(i));
    }

    private static void addStringToGivenPosition(List<String>list,int pos,String elem){
        list.add(pos,elem);
    }

    private static void addFirst(List<String>list,String elem){
        list.add(0,elem);
    }

    private static void displayElemAndPosition(List<Integer> list){
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i)+" has index: "+i);
        }
    }

    private static Integer maximum(List<Integer>list){
        return Collections.max(list);
    }

}
