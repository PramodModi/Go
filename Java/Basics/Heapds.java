/*
 Java does not have a specific built-in heap class, but the PriorityQueue class in the java.util package
 is often used to implement a min-heap.
 By default, PriorityQueue is a min-heap, meaning the smallest element is the root.
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class Heapds {
    public static void main(String[] args) {
        //Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(4);
        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(6);
        minHeap.add(7);
        minHeap.add(2);
        System.out.println("Min Heap : " + minHeap);
        int minElement = minHeap.poll();
        System.out.println("minElement : " + minElement);
        System.out.println("Min Heap : " + minHeap);

        //Max Heap
        System.out.println(" ***This is Max Heap*** ");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(4);
        maxHeap.add(5);
        maxHeap.add(3);
        maxHeap.add(6);
        maxHeap.add(7);
        maxHeap.add(2);
        System.out.println("Max Heap : " + maxHeap);
        int maxElement = maxHeap.poll();
        System.out.println("maxElement : " + maxElement);
        System.out.println("Max Heap : " + maxHeap);

    }
}
