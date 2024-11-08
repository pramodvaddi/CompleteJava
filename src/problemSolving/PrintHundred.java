package problemSolving;

import java.util.Scanner;

public class PrintHundred {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number: ");
        int startingNumber = sc.nextInt();

        System.out.println("Enter ending number: ");
        int endingNumber = sc.nextInt();


        while(startingNumber <= endingNumber) {
            System.out.println(startingNumber);
            startingNumber++;
        }


    }
}
