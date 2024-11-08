package dataStructuresAlgorithms.arrays;

public class ArrayDS {
    /*
        Array is a Data Structure that stores data of SAME TYPE in a SEQUENTIAL MANNER.
        An Array takes contiguous section of memory.
        An Array index starts from 0.
    */

    public static void main(String[] args) {
        // Array with initial value (Size determined automatically
        int[] arrayOne = {1,2,3,4,5};

        // Empty Array with size = 5. Initially all values will be 0 by default.
        int[] arrayTwo = new int[5];

        // Get
        System.out.println(arrayOne[2]);

        // Set
        arrayOne[0] = 90;
        System.out.println(arrayOne[0]);

        // Length: Gives size of the array
        System.out.println(arrayOne.length);

        // Traverse in an Array: Using For Each loop
        System.out.println("Travel Using For Each Loop");
        for(int arr: arrayOne){
            System.out.println(arr);
        }

        // Traverse in an Array: Using For loop
        System.out.println("Travel Using For Loop");
        for(int i = 0; i< arrayOne.length; i++){
            System.out.println(arrayOne[i]);
        }



    }
}
