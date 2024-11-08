package problemSolving.dl;

public class Constructors {

    // Default Constructor
    Constructors() {
        System.out.println("This is constructor");
    }

    // Parameterized constructor
    Constructors(int age) {
        if(age>18){
            System.out.println("You are eligible for driving test");
        } else {
            System.out.println("You are not eligible for a test");
        }
    }

    public static void main(String[] args) {

        Constructors example = new Constructors();
        Constructors driversLicence = new Constructors(19);

    }
}
