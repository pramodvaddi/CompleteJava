package dataStructuresAlgorithms.arrays;

import java.util.Scanner;

public class SubArrays  {
    // 4. Write an algorithm to print Subarrays of an array.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();

        int[] arrayOne = new int[size];
        for(int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = sc.nextInt();
        }

        // Main Logic
        for(int si = 0; si < size; si++){
            for(int ei = si; ei < size; ei ++){
                for(int k = si; k <= ei; k++){
                    System.out.print(arrayOne[k] + " ");
                }
                System.out.println();
            }

        }
    }
}
