package coreJava.advanced.lambda;

public class Lambda {
    // A pillar of Functional interface.
    // A short form to write code.
    // Unlike Verbose code (detailed code) , we can reduce the number of lines of code.
    // Used to implement functional interfaces only.
    // We use Arrow token ( -> ) to declare Lambda expression.
    // Java 8: Lambda Expression.

    // Semicolons required for anonymous classes and anonymous functions.
    // Lambda function contains three components: Arguments list, Arrow token, Function body.
}

class A {
    public static void main(String[] args) {
        // Anonymous Class: Traditional way (Verbose Code).
        Car c1 = new Car() {
            @Override
            public void drive() {
                System.out.println("Driving Audi A7");
            }
        };
        c1.drive();

        // Lambda expression with anonymous function.
        Car c2 = () -> {
            System.out.println("Hyundai i20");

        };
        c2.drive();


    }
}

class Audi implements Car{

    @Override
    public void drive() {
        System.out.println("Driving Audi....");
    }
}

@FunctionalInterface
interface Car {
    public void drive();
}