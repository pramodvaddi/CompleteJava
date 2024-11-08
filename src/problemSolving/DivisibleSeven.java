package problemSolving;

import java.util.Scanner;

public class DivisibleSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number: ");
        int startingNumber = sc.nextInt();

        System.out.println("Enter ending number: ");
        int endingNumber = sc.nextInt();


        while(startingNumber <= endingNumber) {
            if(startingNumber % 7 == 0){
                System.out.println(startingNumber);
            }
            startingNumber++;
        }

    }
}
