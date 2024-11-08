package dataStructuresAlgorithms.arrays;
import java.util.Scanner;

public class ArraySum {
    /*
        1. Write an algorithm to find the sum of an Array.

        Sample Size:
            8
        Sample Input:
            10 3 -1 -8 7 12 3 15
        Sample Output:
            41
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int arrSize = sc.nextInt();

        int[] sampleArray = new int[arrSize];
        for(int i = 0; i < sampleArray.length; i++){
            sampleArray[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i <sampleArray.length; i++){
            sum = sum + sampleArray[i];
        }
        System.out.println("Size of the Array is: "+ sum);

    }
}
