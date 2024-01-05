/*
allows elements to be added or removed from both ends. Java provides several implementations of the Deque interface,
including LinkedList and ArrayDeque.
ArrayDeque is better if operations resist to ends only not in between the list.
* */

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeds {
    public static void main(String[] args) {
        Deque<String> dequeue= new ArrayDeque<>();
        dequeue.addLast("one");
        dequeue.addLast("two");
        dequeue.addFirst("three");
        dequeue.addFirst("four");
        System.out.println("Dequeue : " + dequeue);

        //Remove elements
        String removedElementAtFirst  = dequeue.removeFirst();
        System.out.println("removedElementAtFirst : " + removedElementAtFirst);
        System.out.println("Dequeue : " + dequeue);

        String removedElementAtLast  = dequeue.removeLast();
        System.out.println("removedElementAtLast : " + removedElementAtLast);
        System.out.println("Dequeue : " + dequeue);

        //Peek element

        String peekElementAtFirst  = dequeue.peekFirst();
        String peekElementAtLast = dequeue.peekLast();
        System.out.println("peekElementAtFirst : " + peekElementAtFirst);
        System.out.println("peekElementAtLast : " + peekElementAtLast);
        System.out.println("Dequeue : " + dequeue);

    }
}
