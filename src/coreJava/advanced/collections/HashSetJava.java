package coreJava.advanced.collections;

import java.util.HashSet;

import java.util.Set;

public class HashSetJava {

    /*
        Duplicates are not allowed.
        HashSet uses HashMap internally.
        HashMap internally uses Array of nodes(Keys, Values).

        Why HashSet internally uses HashMap? Why not LinkedList or ArrayList?
        A. In HashMap, duplicate keys are not allowed. If you want a data structure that stores only unique values, we have HashSet.Values will be added as Keys and values will be some dummy objects.

        Based on Hash code, elements will be arranged.
        Values will be added as Keys and values will be some dummy objects.

                                             Important points to remember
          1. What is default capacity?
          A. 0

          2. What is Initial capacity?
          A. 16

          3. Does it allow duplicate elements?
          A. No

          4. Does it allow null values?
          A. Yes

          5. Does it maintain insertion order? (Always, insertion order is opposite of sorted order).
          A. No

          6. Does it maintain sorted order?
          A. No

          7. Does it offer random access of elements?
          A. No

          8. Is it Synchronised?. (When multiple threads try to access, Vector will not allow, it will synchronise one by one.
          A. No

    */
    public static void main(String[] args) {
        // Ways of creating HashSet: Does not maintain insertion order. Follows HashMap internally.
        Set<Integer> hset = new HashSet<>();
        HashSet<Integer> hsetOne = new HashSet<>();

        // Adding elements: add, addAll
        hset.add(2);
        hset.add(4);
        hset.add(9);
        hset.add(98);
        hset.add(98);

        System.out.println(hset);

        // Remove: Here, we remove elements not by index number
        hset.remove(98);

        // Verification
        System.out.println(hset.contains(89));

        // Retrieval
        for(Integer elements: hset){
            System.out.println(elements);
        }



    }

}
