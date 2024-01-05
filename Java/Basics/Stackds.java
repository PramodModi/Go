/*
Stack class in Java is considered somewhat legacy, and it's recommended to use
the Deque interface (Double Ended Queue) from the java.util package when implementing a stack-like structure.
You can use ArrayDeque as an efficient implementation of a stack.

Using Deque for stack operations provides more flexibility and allows you to switch
between stack and queue behavior as needed.
* * */

import java.util.ArrayDeque;
import java.util.Deque;

public class Stackds {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.push("one");
        deque.push("two");
        deque.push("three");
        deque.push("four");
        deque.push("five");
        deque.push("six");
        deque.push("seven");
        System.out.println("Stack : " + deque);

        // Pop the element
        String poppedElement = deque.pop();
        System.out.println("poppedElement : " + poppedElement);
        System.out.println("Stack : " + deque);

        //top element
        String topElement = deque.peek();
        System.out.println("topElement : " + topElement);
        System.out.println("Stack : " + deque);

    }
}
