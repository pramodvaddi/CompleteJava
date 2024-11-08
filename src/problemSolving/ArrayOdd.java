package problemSolving;

import java.util.Scanner;

public class ArrayOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Add values...");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Odd Numbers:");
        for(int oddNumbers: arr){
            if(oddNumbers % 2 != 0){
                System.out.println(oddNumbers);
            }
        }

    }
}
