package coreJava.advanced.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeJava {


    /*
        ArrayDeque is two-sided Queue.
        PriorityQueue is one way, deletion will be done only at head.
        Default capacity of ArrayDeque is 17.
        We can do insertion/deletion from both ends (Head and Tail).

                                     Important points to remember
          1. What is default capacity?
          A. 17

          2. What is Initial capacity?
          A. 17

          3. Does it allow duplicate elements?
          A. Yes

          4. Does it allow null values?
          A. No

          5. Does it maintain insertion order? (Always, insertion order is opposite of sorted order).
          A. No

          6. Does it maintain sorted order?
          A. No

          7. Does it offer random access of elements?
          A. No

          8. Is it Synchronised?. (When multiple threads try to access, Vector will not allow, it will synchronise one by one.
          A. No

          9. What is it good at?
          A. Priority based operations.
    */

    public static void main(String[] args) {
        // Ways of creating ArrayDeque
        ArrayDeque<String> arrDeq = new ArrayDeque<>();
        Queue<Integer> arrDeqTwo = new ArrayDeque<>();
        Deque<Integer> arrDeqThree = new ArrayDeque<>();

        // Adding elements: offer(By default it will add at last), OfferFirst(Adds at first), OfferLast(Adds at Last), add, addFirst, addLast, addAll.

        arrDeq.offer("Pramod");
        arrDeq.offerLast("Saatvik");
        arrDeq.offerFirst("Pankaj");
        arrDeq.offerFirst("Aaron");
        arrDeq.add("Jason");
        arrDeq.addFirst("Jimmie");

        // Output: Jimmie, Aaron,Pankaj,Pramod, Saatvik, Jason
        System.out.println(arrDeq);

        System.out.println("Retrieval of elements");
        // Retrieval: Peek, PeekFirst, PeekLast
        System.out.println(arrDeq.peek()); // Jimmie
        System.out.println(arrDeq.peekFirst()); // Jimmie
        System.out.println(arrDeq.peekLast()); // Jason

        System.out.println("Removal of elements");
        // Removal: Poll, PollFirst, PollLast
        System.out.println(arrDeq.poll()); // Jimmie
        System.out.println(arrDeq.pollFirst()); // Aaron
        System.out.println(arrDeq.pollLast()); // Jason






    }
}
