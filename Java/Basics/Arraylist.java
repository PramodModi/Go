import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(4);
        myList.add(6);
        myList.add(2);
        myList.add(6);

        System.out.println(("MyList = " + myList));

        //Remove item at index 3 that is remove 4 from myList
        myList.remove(4);
        System.out.println("MyList after removing item at index 3 = " + myList);

        //Remove item 2 from myList
        myList.remove(Integer.valueOf(2));
        System.out.println("MyList after removing item 2 = " + myList);

        //Sort the list
        myList.add(2);
        myList.add(4);
        Collections.sort(myList);
        System.out.println("After Sorting : " + myList);

        List<String> stringArray = new ArrayList<>();
        stringArray.add("papaya");
        stringArray.add("apple");
        stringArray.add("banana");
        stringArray.add("pineapple");
        stringArray.add("orange");
        System.out.println("String array : " + stringArray);
        stringArray.sort(Comparator.comparing(String::length));
        System.out.println("After Sorting with length :" + stringArray );

    }
}
