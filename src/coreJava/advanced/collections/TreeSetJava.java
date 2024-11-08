package coreJava.advanced.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetJava {
    /*
        TreeSet follows TreeMap internally.
        TreeMap follows Binary tree internally.
        Stores data in a tree format.
        Follows sorted order.

                                             Important points to remember
          1. What is default capacity?
          A. 0

          2. What is Initial capacity?
          A. 0

          3. Does it allow duplicate elements?
          A. No

          4. Does it allow null values?
          A. No

          5. Does it maintain insertion order? (Always, insertion order is opposite of sorted order).
          A. No

          6. Does it maintain sorted order?
          A. Yes

          7. Does it offer random access of elements?
          A. No

          8. Is it Synchronised?. (When multiple threads try to access, Vector will not allow, it will synchronise one by one.
          A. No

    */

    public static void main(String[] args) {

        // Ways of creating TreeSet
        Set<Integer> trs = new TreeSet<>();
        TreeSet<Integer> trss = new TreeSet<>();

        trs.add(1);
        trs.add(2);
        trs.add(4);
        trs.add(9);
        trs.add(6);
        trs.add(6);
        trs.add(7);
        trs.add(10);
        trs.add(3);
        trs.add(5);

        System.out.println(trs);

        // Remove: Here, we remove elements not by index number
        trs.remove(8);

        // Verification
        System.out.println(trs.contains(89));

        // Retrieval
        for(Integer elements: trs){
            System.out.println(elements);
        }

        // As the elements are sorted in an order, we have some additional methods as follows.

        // TreeSet Additional Methods
        System.out.println("TreeSet additional methods");
        trss.add(1);
        trss.add(2);
        trss.add(4);
        trss.add(9);
        trss.add(6);
        trss.add(6);
        trss.add(7);
        trss.add(10);
        trss.add(3);
        trss.add(5);

        // .first();
        System.out.println(trss.first());
        System.out.println(trss);

        // .last();
        System.out.println(trss.last());

        // .pollFirst();
        System.out.println(trss.pollFirst());
        System.out.println(trss);

        // .pollLast();
        System.out.println(trss.pollLast());
        System.out.println(trss);

        // .subset(4,9); This will print elements between 4 and 9.
        System.out.println(trss.subSet(4,9));


        // .decendingSet(); This will reverse the set.
        System.out.println(trss.descendingSet());


    }
}
