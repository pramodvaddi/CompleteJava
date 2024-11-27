package coreJava.advanced.functional_interface;

import java.lang.FunctionalInterface;

/*
    If an interface consists only one abstract method, it is considered as Functional Interface.

    Also known as SAM, Single Abstract Method

    Introduced in Java 1.8.

    After java 1.8, default, private, static methods can have implementation.

    In Functional interface, only one abstract method and unlimited Private Default Static methods can be made.

*/
@FunctionalInterface
public interface CarDetails {
    void drive();

    private void key(){

    }

    static int price(){
        return 0;
    }
    default void doors(){

    }

}
