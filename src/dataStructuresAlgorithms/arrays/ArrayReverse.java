package dataStructuresAlgorithms.arrays;

import java.util.Scanner;

public class ArrayReverse {
    /*
        3. Write an algorithm to reverse an Array
        Size: 8
        Sample Input: 5 10 -1 14 -7 21 -3 1
        Sample Output: 1 -3 21 -7 14 -1 10 5

    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();

        int[] arrayOne = new int[size];
        for(int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = sc.nextInt();
        }

        // Main Logic: Reverse an Array. (Multiple Swapping)
        int i = 0; // Forward
        int j = size - 1; // Backward

        while(i < j){
            int temp = arrayOne[i];
            arrayOne[i] = arrayOne[j];
            arrayOne[j] = temp;

            i++;
            j--;

        }
        for(int k = 0; k < size; k++){
            System.out.print(arrayOne[k]+ " ");
        }

    }
}
