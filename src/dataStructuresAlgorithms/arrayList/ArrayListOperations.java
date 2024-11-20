package dataStructuresAlgorithms.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
    /*
        Operations on an ArrayList
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        // Adding elements
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        // Add at a specific index position
        arr.add(0, 90);
        arr.add(1, 45);

        // Get from the index position.
        System.out.println(arr.get(2));

        // Set
        System.out.println(arr.set(0, 80));

        // Remove: Here, removing from the last index will be easy it doesn't need to shift the positions of remaining elements.
        System.out.println(arr.remove(0));

        // Size
        System.out.println(arr.size());

        // To know the index position of a specific element.
        System.out.println(arr.indexOf(10));

        // Returns a String representation.
        System.out.println(arr.toString());
    }
}
