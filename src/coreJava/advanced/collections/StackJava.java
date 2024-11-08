package coreJava.advanced.collections;

import java.util.Stack;

public class StackJava {
    // We have to imagine stack vertically. Just like stack of books.
    // Bottom index will be 0.

    /*


                                 Hierarchy of List interface

                                         Iterable
                                        (extends)
                                     Collection<Interface>
                         (extends)                         (extends)
                        List<Interface>                      Queue
                         (implements)
              ArrayList    Vector  LinkedList (implements) ---Deque
                          (extends)
                            Stack

        Stack: A Stack is a class that implementing list interface and extends Vector class which representing LIFO.

        There are two principle in Data Structures.
            1. LIFO: Last In First Out.
            2. FIFO: First In Last Out.

            Stack is LIFO.
            Queue is FIFO.

                                      Major Operations

            1. Creation of a Stack
            A. Stack<Integer> s1 = new Stack<>();

            2. Addition of elements to the list.
            A. s1.add(9);

            3. Retrieval of elements from the list.
            A. s1.get(0);

            4. Deletion of elements from the list.
            A. s1.remove();

            5. Verification of elements in the list.
            A. s1.contains("Test");

            6. Updation of elements in the list.
            A. s1.set(0, "Pramod");



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
          A. When we have LIFO. Ex: Undo, Redo...

            We cannot create a stack with predefined elements.

            Special methods for Stack.
                1. Push: Will push the element to the stack.
                2. Pop: Will remove element from stack, LIFO.
                3. Peek: Will show last added or recently added element in the stack.
                4. Search: Will give you index number of the searched element. This will be from the last. Ex. 1,2,3,...

    */


    public static void main(String[] args) {


        Stack<String> books = new Stack<>();
        books.add("Harry Potter");
        books.add("John Gresham");
        books.add("English");
        books.push("Mathematics");
        books.add("English");
        books.push("Mathematics");
        books.push(null);

        System.out.println(books.peek());
        System.out.println(books.pop());
        System.out.println(books);

        System.out.println(books.search("Harry Potter"));
        System.out.println(books.indexOf("Harry Potter"));


    }
}
