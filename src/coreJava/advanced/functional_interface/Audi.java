package coreJava.advanced.functional_interface;

public class Audi {

    public static void main(String[] args) {
        CarDetails ard = new CarDetails() {
            @Override
            public void drive() {
                System.out.println("I will drive");
            }
        };

        ard.drive();
    }
}
