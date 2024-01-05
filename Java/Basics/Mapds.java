import java.util.HashMap;
import java.util.Map;

/*
Map is a data structure that stores key-value pairs, allowing you to associate a value with a unique key.
The Map interface is part of the java.util package, and it provides several implementations,
such as HashMap, LinkedHashMap, and TreeMap.

HashMap is an unordered collection of elements, and it uses a hash table to store the elements.
O(1) complexity on average, but can be O(n) on worst case due to collision.
LinkedHashMap maintain the order in which elements are inserted.
LinkedHashMap uses doubly linkedlist, hence O(1) complexity for operations.
TreeMap stores elements in a sorted order based on their natural ordering or a custom comparator.
TreeMap uses balanced Tree(Red black tree), hence log(n) complexity for operations.
* */
public class Mapds {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 1);
        map.put("Key2", 2);
        map.put("Key3", 3);
        map.put("Key4", 4);
        map.put("Key5", 5);
        map.put("Key6", 6);
        map.put("Key7", 7);
        System.out.println("Map : " + map);

        // Get the value associated with key2
        int valueForKey2 = map.get("Key2");
        boolean containskey3 = map.containsKey("Key3");
        boolean containskey9 = map.containsKey("key9");
        System.out.println("valueForKey2 = " + valueForKey2);
        System.out.println("containskey3 = " + containskey3);
        System.out.println("containskey9 = " + containskey9);
        // Remove key value pair
        map.remove("Key3");
        System.out.println("After Removing key3, map : " + map);

        //Iterate over keys and Values over the map

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Key : " + entry.getKey() + ", value : "+ entry.getValue());
        }

    }
}
