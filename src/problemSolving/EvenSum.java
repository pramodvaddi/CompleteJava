package problemSolving;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number: ");
        int startingNumber = sc.nextInt();

        System.out.println("Enter ending number: ");
        int endingNumber = sc.nextInt();

        int sum = 0;
        while(startingNumber <= endingNumber) {
            if(startingNumber % 2 == 0){
                sum += startingNumber;

            }
            startingNumber++;
        }
        System.out.println("The Sum of the Even numbers is " + sum);
    }
}
