package coreJava.advanced.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListJava {

    /*
        Both ArrayList and VectorList are similar to Array.

        ArrayList: This will increase/increment by 50%. Ex: 10, 15, 22, 33,...
        VectorList: This will increase/increment by 100%. Ex: 10,20,40,80,....

        In Vector, we have size() and capacity(). But in ArrayList, we have only size().

                               Hierarchy of List interface

                                         Iterable
                                        (extends)
                                     Collection<Interface>
                         (extends)                         (extends)
                        List<Interface>                      Queue
                         (implements)
              ArrayList    Vector  LinkedList (implements)--- Deque
                          (extends)
                            Stack


                                    Major Operations

            1. Creation of a List
            A. ArrayList<Integer> arList = new ArrayList<>();

            2. Addition of elements to the list.
            A. arList.add(9);

            3. Retrieval of elements from the list.
            A. arList.get(0);

            4. Deletion of elements from the list.
            A. arList.remove();

            5. Verification of elements in the list.
            A. arList.contains("Test");

            6. Update of elements in the list.
            A. arList.set(0, "Pramod");

            ArrayList is not synchronised. We need to manually do it using Collections class.
            Ex:Collections.synchronizedList(all);

                                Important points to remember

          1. What is default capacity? (When elements not added to the list)
          A. 0

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
          A. No, we need to do it manually by using Collection class..

          9. What is it good at?
          A. When the data is not increasing exponentially.

          Disadvantages:
              1. Data will not be exponentially increased.
              2. Not suitable when working with Multi-Threading.

    */
        public static void main(String[] args) {

            Integer[] arr = new Integer[] {9,9,9};
            // Creating ArrayList from Array
            ArrayList<Integer> arOne = new ArrayList<>(Arrays.asList(arr));
            arOne.add(1);
            arOne.add(2);
            arOne.add(3);
            arOne.add(null);
            arOne.add(null);
            arOne.add(8);

            System.out.println(arOne);


        }
}
