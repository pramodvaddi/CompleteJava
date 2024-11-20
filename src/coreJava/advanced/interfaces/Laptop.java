package coreJava.advanced.interfaces;

public interface Laptop {
    // Mostly used in Enterprise applications.

    /*
         Interface: A blue - print of a class and class is a blue - print of an object.
            It is like a business document.
            Interface follows what to do, means no implementation.
            Class follows how to do, we have to write code. Implementation.

            There will not be any implementation here as this says what to do.

         What to do in Interface is until Java 7.
         From Java 8, we can also write how to do in Java using Stream API.

         To provide implementation, we have two ways
               1. Using Default keyword.
               2. Using Static keyword.


        By default, a method without any access modifier is declared as public in an interface.

        Public, Private, Default and Static.

    */

    // Creating Abstract methods.

    public void speakers();

    public void camera();

    public void copy();

    public void paste();

    // Public default void security
    default void security() {
        System.out.println("Impliment");
    }
    // Public static void cost
    static void cost(){
        commonCode();
        System.out.println("global market");
    }

    // Private: Introduced in Java 1.9 for code reusability.
    private static void commonCode(){
        System.out.println("Common code");
    }



}
