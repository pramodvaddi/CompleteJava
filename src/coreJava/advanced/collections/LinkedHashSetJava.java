package coreJava.advanced.collections;

import java.util.Set;

public class LinkedHashSet {

    public static void main(String[] args) {

        // Ways of creating LinkedHashSet: This maintains insertion order. Follow LinkedHashMap internally.
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
    }
}
