package problemSolving;

import java.util.Scanner;

public class GreatestThree {
    public static void main(String[] args) {
        // Finding greatest of three given numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x = sc.nextInt();
        System.out.println("Enter second number:");
        int y = sc.nextInt();
        System.out.println("Enter third number:");
        int z = sc.nextInt();
        int greater;

        if(x>y){
            if(x>z){
                greater = x;
            } else {
                greater = y;
            }

        } else if (y > z) {
            greater = y;
        } else {
            greater = z;
        }
        System.out.println("Greatest of three numbers is " + greater);

    }
}
