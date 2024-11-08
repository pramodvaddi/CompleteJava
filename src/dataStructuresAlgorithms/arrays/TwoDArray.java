package dataStructuresAlgorithms.arrays;

import java.util.jar.JarOutputStream;

public class TwoDArray {
    /*
        Row and Column indexing starts from 0.
        Represented as (Row, Column)
        Default values will be 0.

    */
    public static void main(String[] args) {

        // Creating an array of 5 Rows and 6 Columns
        int[][] arrayOne = new int[2][2];

        // Set values
        arrayOne[0][0] = 1;
        arrayOne[0][1] = 2;

        arrayOne[1][0] = 3;
        arrayOne[1][1] = 4;

        // Get values
        System.out.println(arrayOne[1][1]);

        // Row Count
        System.out.println(arrayOne.length);

        // Column Count
        System.out.println(arrayOne[0].length);

        // Traverse
        for(int i= 0; i < arrayOne.length; i++){
            for(int j = 0; j < arrayOne[0].length; j++){
                System.out.print(arrayOne[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
