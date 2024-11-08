package dataStructuresAlgorithms.arrays;

public class TransposeArray {
    /*
        5. Transpose of a Matrix (Row to column & Column to Row)
    */

    public static void main(String[] args) {

        int[][] arrayOne = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}

        };
        transpose(arrayOne);

    }
    public static void transpose(int[][] arrayOne){
        // Lower triangle of the matrix -> Swap ((i,j) - (j,i))

        for(int i = 0;i < arrayOne.length; i++){
            for(int j = 0; j < i; j ++){ // j < i because column number is always lesser than row number
                int temp = arrayOne[i][j];
                arrayOne[i][j] = arrayOne[j][i];
                arrayOne[j][i] = temp;
            }
        }

        for(int i = 0; i < arrayOne.length; i++){
            for(int j = 0; j < arrayOne[0].length; j++){
                System.out.print(arrayOne[i][j] + " ");
            }
            System.out.println();
        }
    }
}
