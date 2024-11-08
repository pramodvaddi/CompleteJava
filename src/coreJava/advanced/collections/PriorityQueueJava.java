package coreJava.advanced.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueJava {
    /*
        To store multiple elements.
        ArrayList, LinkedList, Stack follow LIFO.
        Queue Data structure is the only one that follows FIFO.
        Priority Queue is the pure implementation of Queue interface.

        PriorityQueue default size is 11.
        PriorityQueue never places elements in sorted way internally.
        Head will point to the highest priority, rest will be jumbles.
        Lowest integer will be the highest priority. Head will be the lowest integer.
        To make the highest number as head (priority), use comparator.

                                             Important points to remember
          1. What is default capacity?
          A. 11

          2. What is Initial capacity?
          A. 11

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
          A. FIFO Operations.

    */

    public static void main(String[] args) {

        // Priority Queue: Doesn't really follows FIFO, outs elements as per priority.
        // Valid ways
        Queue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pqOne = new PriorityQueue<>(Comparator.reverseOrder());

        // Adding elements: offer, add
        pq.add(10);
        pq.offer(8);
        pq.offer(4);
        pq.offer(1);
        pq.add(2);
        pq.add(2);
        System.out.println(pq);

        // Retrieval: peek. Only head element.
        System.out.println("Retrieves only head element, that is "+pq.peek());


        // Removal: Poll, Remove. Removes head value and prints the removed value in the console.
        // Poll will print null if queue is empty, remove will throw exception.
        System.out.println("The removed head value is " + pq.poll());

        // Checking if element is present.
        System.out.println(pq.contains(2));

        System.out.println("Using with comparator to make the highest element as priority.");
        // Using Comparator to make the highest element as head(priority)
        pqOne.offer(1);
        pqOne.offer(2);
        pqOne.offer(4);
        pqOne.offer(9);
        pqOne.offer(9);
        System.out.println(pqOne);
        while(!pqOne.isEmpty()){
            System.out.println(pqOne.poll());
        }








    }
}
