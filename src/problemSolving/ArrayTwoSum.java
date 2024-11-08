package problemSolving;

import java.util.Scanner;

public class ArrayTwoSum {
    // Sum of two Arrays
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array: ");
        int sizeX = sc.nextInt();
        System.out.println("Enter sizse of second array: ");
        int sizeY = sc.nextInt();
        int arrOne[][] = new int[sizeX][sizeY];
        int arrTwo[][] = new int[sizeX][sizeY];
        int arrSum[][] = new int[sizeX][sizeY];
        // First array
        System.out.println("Enter the values of First Array");
        for(int i = 0; i<sizeX; i++){
            for(int j = 0; j<sizeY; j++){
                arrOne[i][j] = sc.nextInt();
            }
        }
        // Second Array
        System.out.println("Enter the values of Second Array");
        for(int i = 0; i < sizeX; i++){
            for(int j = 0; j< sizeY; j++){
                arrTwo[i][j] = sc.nextInt();
            }
        }
        sc.close();
        // Adding Two arrays
        System.out.println("The sum of two arrays");
        for(int i = 0; i<sizeX; i++){
            for(int j = 0; j<sizeY; j++){
                arrSum[i][j] =  arrOne[i][j] + arrTwo[i][j];
                System.out.print(arrSum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
