package problemSolving;

import java.util.Scanner;

public class CheckPositive {

    public static void main(String[] args) {
        // Check if the given number is positive and negative.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a positive or negative: ");
        int num = sc.nextInt();
        if(num >= 0){
            System.out.println("Its Positive number");
        } else {
            System.out.println("Its a Negative number");
        }
    }
}
