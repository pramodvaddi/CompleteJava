package problemSolving;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Add Values...");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int maxNum: arr){
           max = Arrays.stream(arr).max().getAsInt();
        }
        System.out.println("The largest number in the array is " + max);
        sc.close();

    }
}
