package coreJava.advanced.interfaces;

public abstract class AbstractClass implements Laptop {

    /*
        Abstract Class: An abstract class is a class which can contain the abstract methods and is defined using abstract keyword.
        Abstract Method: An un-implemented method.

        When you have an interface with abstract 5 methods, and you have implemented it using class. In this case you have you
        provide implementation for all the methods inside interface. To overcome this, from the Java 8 version we have default
        and static methods for the interface.
        But when you make a class as abstract, then you have chose which method to implement.

        Abstract is also known as non-accessible modifier.

        Abstract methods can only be declared in abstract class.
        We cannot create an instance for abstract class.


    */

    @Override
    public void camera() {
        System.out.println("4K Camera");
    }

    @Override
    public void security() {
        Laptop.super.security();
    }

    @Override
    public void speakers() {
        System.out.println("Dolby Digital");
    }
}
