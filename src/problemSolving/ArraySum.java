package problemSolving;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Add Values...");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.println("Sum of Array");
        for(int arraySum: arr){
            sum = arraySum+sum;
        }
        System.out.println(sum);
    }
}
