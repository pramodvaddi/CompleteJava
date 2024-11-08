package problemSolving;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example 1:
        System.out.println("Enter First Number: ");
        int first = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int second = sc.nextInt();

        for(int z = first; z <= second; z++){
            int x = 2;
            if(z != 1 && z % x != 0){
                System.out.println(z);
            }
        }

    }
}
