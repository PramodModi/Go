/*
Java provides a Queue interface in the java.util package, and there are several classes that implement this interface,
 such as LinkedList and PriorityQueue.
 */

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queueds {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        queue.offer("five");
        queue.offer("six");
        System.out.println("Queue = " + queue);

        //Remove elements from queue

        String removedElement = queue.poll();
        System.out.println("removedElement = " + removedElement);
        System.out.println("Queue after poll = " + queue);

        // Peek the first element without removing it from queue

        String firstElement = queue.peek();
        System.out.println("firstElement = " + firstElement);
        System.out.println("Queue after peek = " + queue);

    }
}
