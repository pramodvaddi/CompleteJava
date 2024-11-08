package coreJava.intermediate;

public class MdArrays {
    // Multi Dimensional Array
    /*
     * Multi Dimensional Array
     *   1. Single Dimension: When an array have n number of rows and fixed number of columns throughout an array.
     *       Ex: 1 2 3 4
     *           5 6 7 8
     *           9 1 3 5
     *   2. Jagged Array: When an array have n number of rows and different number of columns.
     *       Ex: 1 2 3 4
     *           2 3
     *           8 7 8
     *           8 9 2 3 4 9
     */
    public static void main(String[] args) {

        // Example 1: Creating 2x2 Array
        int[][] myArr = new int[2][2];

        // Row 1
        myArr[0][0] = 1;
        myArr[0][1] = 2;

        // Row 2
        myArr[1][0] = 3;
        myArr[1][1] = 4;

        for(int i = 0; i< myArr.length; i++){
            int[] singleRow = myArr[i];
            for(int j = 0; j<singleRow.length; j++){
                System.out.print(singleRow[j] + " ");
            }
            System.out.println();
        }


        // Example 2: Creating 3x2 Array
        String[][] names = new String[3][2];

        // Row 1
        names[0][0] = "Pramod";
        names[0][1] = "Saatvik";

        // Row 2
        names[1][0] = "Steve";
        names[1][1] = "Zach";

        // Row 3
        names[2][0] = "James";
        names[2][1] = "Jonathan";

        // Printing a specific element of an array using its index.
        System.out.println(names[1][1]);

        // Printing all elements of an array using loop
        for(int x = 0; x< names.length; x++){
            String[] single = names[x];
            for(int y = 0; y<single.length; y++){
                System.out.print(single[y] + " ");
            }
            System.out.println();
        }



    }
}
