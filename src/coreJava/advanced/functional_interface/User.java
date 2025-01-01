package coreJava.advanced.functional_interface;

public class User {

    // To avoid creating multiple classes, we can use anonymous classes.

    public static void main(String[] args) {
        CarDetails crd = new CarDetails() {
            @Override
            public void drive() {
                System.out.println("I am driving BMW.");
            }
        };

        crd.drive();
    }
}
