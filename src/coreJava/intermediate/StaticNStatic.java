package coreJava.intermediate;

import java.util.Random;

public class StaticNStatic {

    /*
        1. To execute any statement in Java, Memory allocation must be done.
        2. Memory allocation in done through objects.
        3. Without creating an object, we cannot execute any statements.
        4. So to overcome this, Java created a static keyword. With which you can execute statements without creating objects.
        5. In Java, memory allocation is done in two ways, one by creating objects and other by using static keyword.

        // JVM Working.
        1. When you execute a Java file, byte code will be generated.
        2. Byte code will go into class loader.
        3. Then class loader will look if there are any static methods/blocks/variable inside the class.
        4. If you have any static M/B/V, then the memory will be created inside Method Area. Here, only one block will be created and it will be shared with Heap memory.
        5. If you have Non-Static M/B/V, then the memory will be created inside Heap Area. Here, for every object a new block will be created inside memory.

        // Static Block and Non-Static Block
        1. Blocks are initializers, they initialize a memory.
        2. Inside a class, to create a static block, (Memory Saver)
                Syntax: static {

                         }
        3. Inside a class, to create a Non-Static block.
                Syntax: {

                        }

        4. A constructor is different, we create constructor for a class using the class name. Constructor cannot be static.


        // Important
        // In Java, we know that main method is the entry point.
        // When you run a file, main method will be executed first.
        // But when you have a static block, this will be executed first before main method.
    */

    static int number;

    public static void main(String[] args) {
        StaticNStatic objectOne = new StaticNStatic();
        objectOne.number = new Random().nextInt();

        StaticNStatic objectTwo = new StaticNStatic();
        objectTwo.number = new Random().nextInt();

        StaticNStatic objectThree = new StaticNStatic();
        objectThree.number = new Random().nextInt();

        // As we have variable number as static, it will be created in Method area.
        // Only one random number will be generated, and it will be shared across the Heap memory.
        // It will output same number.
        System.out.println(objectOne.number);
        System.out.println(objectTwo.number);
        System.out.println(objectThree.number);
    }
}
