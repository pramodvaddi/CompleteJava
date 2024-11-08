package coreJava.advanced.iteratorEnumerator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorJava {

    // ListIterator is an interface.
    // Introduced for iterating only List type of collection objects.
    // Legacy classes v1.0 :  ArrayList, LinkedList, Vector, Stack.
    // Advanced version of Iterator, we can read and write.


    public static void main(String[] args) {

        ArrayList<Integer> arrl = new ArrayList<>();
        arrl.add(5);
        arrl.add(9);
        arrl.add(98);

        ListIterator<Integer> lst = arrl.listIterator();

        // Forward
        while (lst.hasNext()){
            System.out.println(lst.next());
        }

        // Adding elements
        lst.add(34);
        lst.add(53);

        System.out.println();
        // Backward
        while (lst.hasPrevious()){
            System.out.println(lst.previous());
        }

        // Removing
        lst.remove();

    }
}
