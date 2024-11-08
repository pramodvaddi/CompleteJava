package coreJava.advanced.collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetJava {

        /*
             Follows insertion order as it follows LinkedHashMap internally and LinkedHashMap follows link of nodes(keys, values).
             Based on Hash code, elements will be arranged.
             Values will be added as Keys and values will be some dummy objects.

                                                  Important points to remember
          1. What is default capacity?
          A. 16

          2. What is Initial capacity?
          A. 16

          3. Does it allow duplicate elements?
          A. No

          4. Does it allow null values?
          A. Yes

          5. Does it maintain insertion order? (Always, insertion order is opposite of sorted order).
          A. Yes

          6. Does it maintain sorted order?
          A. No

          7. Does it offer random access of elements?
          A. No

          8. Is it Synchronised?. (When multiple threads try to access, Vector will not allow, it will synchronise one by one.
          A. No

         */

    public static void main(String[] args) {

        // Ways of creating LinkedHashSet: This maintains insertion order. Follow LinkedHashMap internally.
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        Set<Integer> lhsOne = new LinkedHashSet<>();

        // LinkedHashSet Operations
        System.out.println("LinkedHashSet Operations");
        lhsOne.add(98);
        lhsOne.add(8);
        lhsOne.add(98);
        lhsOne.add(1);
        lhsOne.add(2);
        lhsOne.add(4);
        System.out.println(lhsOne);

        // Remove: Here, we remove elements not by index number
        lhsOne.remove(98);

        // Verification
        System.out.println(lhsOne.contains(89));

        // Retrieval
        for(Integer elements: lhsOne){
            System.out.println(elements);
        }
    }
}
