package coreJava.advanced.iteratorEnumerator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    // Iteration is an interface.
    // Introduced for iterating legacy collection objects.
    // Legacy classes v1.0 :  HashTable, Stack, Vector, Dictionary, Properties.
    // Forward direction, read-only with special permission for removing elements.
    public static void main(String[] args) {

        ArrayList<Integer> arrl = new ArrayList<>();
        arrl.add(5);
        arrl.add(9);
        arrl.add(98);

        Iterator<Integer> i = arrl.iterator();
        // .hasNext();
        // .next();

        while (i.hasNext()){
            System.out.println(i.next());
        }

        // To remove with special permission
//        i.next();
//        i.remove(); // This will remove first element.
//
//        i.next();
//        i.remove(); // This will remove second element.
    }
}
