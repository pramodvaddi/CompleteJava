package coreJava.intermediate;

public class Constructors {
    // Constructor: A block of code. We call the constructor while creating the object and method after creating the object.
    // A constructor is called when an instance (object) of the class is created.
    // Implicit Constructor: Given by Java by default. We can see this in bin folder.
    // Explicit Constructor: User defined.
    // Constructors are used in memory management.

    // Rule 1. Constructor name must be same as class name.
    // Rule 2. Return type concept does not exist.
    // Rule 3. Default constructors / Implicit constructors are always public.
    // Rule 4. Public, Protected, Private modifiers are only allowed.

    int age = 19;

    public Constructors() {
        System.out.println("I am a default non parameterized constructor");
    }

    public Constructors(String name){
        System.out.println("I am a parametarized constructor "+ name);
    }


    public static void main(String[] args) {
           Constructors con =  new Constructors();
           System.out.println(con.age);

           Constructors bon = new Constructors("Pramod");
           System.out.println(bon.age);
    }
}
