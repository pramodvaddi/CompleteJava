package problemSolving;

import java.util.Scanner;

public class EvenArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Add values...");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[0]);
        System.out.println("Even Numbers: ");
        for(int evenNumbers: arr){
            if(evenNumbers % 2 == 0){
                System.out.println(evenNumbers);
            }
        }
        sc.close();
    }
}
