package JavaForSpring.functionalInterface;

public class User {
    public static void main(String[] args) {

        // Creating anonymous class. 
        Car c = new Car() {
            @Override
            public void drive() {
                System.out.println("Driving");
            }
        };

        c.drive();
    }
}
