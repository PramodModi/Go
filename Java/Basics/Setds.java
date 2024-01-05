import java.util.HashSet;
import java.util.Set;

/*
In Java, a Set is a collection that does not allow duplicate elements.
It models the mathematical set abstraction and is part of the java.util package.
The Set interface extends the Collection interface, and it does not guarantee the order of elements.

There are several implementations of the Set interface in Java, including HashSet, LinkedHashSet, and TreeSet.

HashSet is an unordered collection of unique elements, and it uses a hash table to store the elements.
O(1) complexity on average, but can be O(n) on worst case due to collision.
LinkedHashSet maintain the order in which elements are inserted.
LinkedHashSet uses doubly linkedlist, hence O(1) complexity for operations.
TreeSet stores elements in a sorted order based on their natural ordering or a custom comparator.
TreeSet uses balanced Tree(Red black tree), hence log(n) complexity for operations.

* */
public class Setds {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("six");
        set.add("six");//Duplicate element, wont be added
        set.add("seven");
        System.out.println("Set is : " + set);

        //Remove element

        set.remove("four");
        System.out.println("After removing four, Set is : " + set);

        // check if element is present

        boolean contains3 = set.contains("three");
        boolean contains4 = set.contains("four");
        System.out.println("contains3 : "+ contains3);
        System.out.println("contains4 : "+ contains4);


    }
}
