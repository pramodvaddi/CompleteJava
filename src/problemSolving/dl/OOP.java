package problemSolving.dl;

import java.util.Scanner;

public class OOP {

    // Without Args and Return
    void addition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        System.out.println("Addition is " + x + y);
        sc.close();
    }
    // With Args and without Return
    void division(int x, int y){
        System.out.println("Division is " + x/y);
    }
    // Without Args and with Return
    String greet(){
        return "Good Morning";
    }
    // With Args and Return
    int multiply(int x, int y){
        return x * y;
    }
    public static void main(String[] args) {
        OOP obj = new OOP();
        // Methods
        obj.addition();

        obj.division(3,5);

        obj.greet();

        System.out.println("The multiplication is "+ obj.multiply(2,4) );


    }
}
