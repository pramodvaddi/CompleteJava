package dataStructuresAlgorithms.arrays;

import java.util.Scanner;

public class ArrayMax {
    /*
        2. Write an algorithm to find the max in an Array.
        Size: 8
        Sample Input: 5 10 -1 14 -7 21 -3 1
        Sample Output: 21
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();

        // Creating an array with the size given by the user.
        int[] arrayOne = new int[size];
        for(int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = sc.nextInt();
        }

        // Main Logic: To find the maximum value in an array

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arrayOne.length; i++){
            if(arrayOne[i] > max){
                max = arrayOne[i];
            }
        }
        System.out.println("The maximum value in an array is " + max);
    }
}
