package coreJava.advanced.collections.arraylist_vector;

import java.util.Vector;

public class GenericsJava {

    /*
        What made Java developers introduce Generics.
            Assume, i created a vector and stored the integer values. The other developer tried to store a data type other than integer and tried to sum it using a loop.
            This will raise an exception. Because of this, devs introduced Generics <> (Rhombus brackets) in Java V1.5.

            Syntax: Vector<Integer> = new Vector();

            Here, we should not use <int> as we cannot create an object for primitive data types.
            Every collection is an object.
            Vector is a class, so we have to use <Integer> wrapper class.

            In Generics, we have to use only wrapper classes.
    */
    public static void main(String[] args) {

        Vector<Integer> v1 = new Vector<>();
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(null);
        v1.add(null);
        v1.add(2);
        v1.add(3);
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        System.out.println(v1);


    }
}
