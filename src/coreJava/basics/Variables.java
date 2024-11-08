package coreJava.basics;

public class Variables {


    // Instance Variable: Non-Static variables.
    // Static Variable: Class level variables.
    // Local Variable: Created inside method.

    // Creating instance variable
    int age = 120;

    // Creating static variable
    static int number = 1234;


    public static void main(String[] args) {
        // To execute instance variable, we need to create object.
        Variables obj = new Variables();
        System.out.println(obj.age);

        // To execute static variable, we can do it directly.
        System.out.println(number);

        // Local Variable
        int otp = 32145;
        System.out.println(otp);

        TypeCasting objType = new TypeCasting();
        objType.m1();

    }
}
