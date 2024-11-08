package coreJava.advanced.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListJava {

    /*
        ArrayList, Vector and Stack implements from List interface.
        LinkedList implements from both List and Deque.
        LinkedList is of two types,
                    1. Single LinkedList: Only next is available.
                    2. Double LinkedList: For a node we have next and previous. Used in Java.
        Deque is extending from Queue, which is extending from List interface.

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

        Valid ways of creating an instance for LinkedList.
            1. LinkedList<Integer> numbers = new LinkedList<>();
            2. List<Integer> numbers = new LinkedList<>();
                    We can only access List methods
            3. Queue<Integer> numbers = new LinkedList<>();
                    We can only access Queue methods.
            4. Deque<Integer> numbers = new LinkedList<>();
                    We can only access Deque/Queue methods.
            5. Collections<Integer> numbers = new LinkedList<>():
            6. Iterable<Integer> numbers = new LinkedList<>();


            Node Class: Contains three compartments
                previous
                data
                next

           A LinkedList is a combination of multiple nodes. Ex. Node is like a train compartment.
           By default, LinkedList size will be 0.
           Node objects will be created when we create elements.
           First node and last node will be null.
           For every new node we create, next (compartment) will be null.
           In next and previous compartments, addresses will be stored.

                                      Important points to remember

          1. What is default capacity? (When elements not added to the list)
          A. 0

          2. What is Initial capacity? (When element added to the list)
          A. 0

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
          A. To add elements, remove, update, ...


    */
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add("Inki");
        name.add("Pinky");


        LinkedList<String> names = new LinkedList<>();
        names.add("Pramod");
        names.add("Aaron");
        names.add("Saatvik");
        names.add("Saatvik");
        names.add("Pramod");
        names.add(null);

        System.out.println(names);
        names.add(0, "John");
        System.out.println(names);

        // Adding ArrayList to LinkedList.
        names.addAll(0, name);
        System.out.println(names);

    }
}
