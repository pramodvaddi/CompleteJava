package coreJava.advanced.collections;

import java.util.Arrays;
import java.util.Vector;

public class  VectorLst {

    /*

        In Java, collections will be coming from java.util package.

        Both ArrayList and VectorList are similar to Array.

        Vector is a Legacy class.

        ArrayList: This will increase/increment by 50%. Ex: 10, 15, 22, 33,...
        VectorList: This will increase/increment by 100%.By default, the size will be 10. Ex: 10,20,40,80,....

        Size: Number of elements present in the list.
        Capacity: Array Capacity. Total available element space.

        In VectorList, order is not checked.

        Vector was introduced in Java V 1.0. Collections are introduced from V 1.2.

                                Major Operations
            1. Creation of a Vector
            A. Vector<Integer> v1 = new Vector<>();

            2. Addition of elements to the Vector.
            A. v1.add(9);

            3. Retrieval of elements from the Vector.
            A. v1.get(0);

            4. Deletion of elements from the Vector.
            A. v1.remove();

            5. Verification of elements in the Vector.
            A. v1.contains("Test");

            6. Updation of elements in the Vector.
            A. v1.set(0, "Pramod");


                             Important points to remember
          1. What is default capacity? (When elements not added to the list)
          A. 10

          2. What is Initial capacity? (When element added to the list)
          A. 10

          3. Does it allow duplicate elements?
          A. Yes

          4. Does it allow null values?
          A. Yes

          5. Does it maintain insertion order? (Always, insertion order is opposite of sorted order).
          A. Yes

          6. Does it maintain sorted order?
          A. No

          7. Does it offer random access of elements?
          A. Yes

          8. Is it Synchronised?. (When multiple threads try to access, Vector will not allow, it will synchronise one by one.
          A. Yes.

          9. What is it good at?
          A. When you have multiple threads and when data increase exponentially, we use Vector.

          Disadvantages:
            1. As Vector is synchronised, it cannot handle multiple threads at a time which results in slower performance.
            2. Default capacity of Vector is 10, if user adds only 4 elements, space of 6 will be wasted.

            To overcome this, we have ArrayList.
    */

    public static void main(String[] args) {

                 // Create an object for Vector.
                 Vector v1 = new Vector();
                 v1.add("Pramod");
                 v1.add("Saatvik");
                 v1.add(0, "Revanth Reddy");
                 v1.add(1, "Jeevan Reddy");

                 Vector v2 = new Vector();
                 v2.add("Donkey");
                 v2.add("Pony");

                 // Adding to vectors.
                v1.addAll(0,v2);
                System.out.println(v1);

                // Retrieve
                v1.get(0);
                System.out.println("I have retrieved " + v1.get(0));

                // Remove
                v1.remove(2);
                System.out.println("After removing " + v1);

                // Remove all
                v1.removeAll(v2);
                System.out.println(v1);

                // Clear
                v2.clear();
                System.out.println(v2);

                // To update
                v1.set(0, "Arjun Reddy");
        System.out.println(v1);

                // To find index number of element
          System.out.println(v1.indexOf("Arjun Reddy"));

          // FirstElement and LastElement
        System.out.println(v1.firstElement());
        System.out.println(v1.lastElement());

        // Creating an Array
        Object[] arr = v1.toArray();
        System.out.println(Arrays.toString(arr));

        Object[] arrr = new Object[]{1,2,3,4,5};
        Vector v3 = new Vector(Arrays.asList(arrr));
        System.out.println(v3);


        System.out.println(v1.contains("Pramod"));

                System.out.println(v1.size());
                System.out.println(v1.capacity());


    }
}
