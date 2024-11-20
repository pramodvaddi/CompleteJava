package dataStructuresAlgorithms.arrayList;

import java.util.ArrayList;

public class RemoveEvenNumbers {
    /*
        Write an algorithm to remove all the even numbers in an ArrayList.
    */
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        // Adding elements
        arr.add(5);
        arr.add(10);
        arr.add(4);
        arr.add(15);
        arr.add(8);
        arr.add(21);
        arr.add(3);
        arr.add(2);

        System.out.println(arr);
        RemoveEven(arr);
        System.out.println(arr);

    }

    public static void RemoveEven(ArrayList<Integer>arr) {
        for(int i = arr.size()-1; i >= 0; i--){
            if(arr.get(i)%2 == 0){
                arr.remove(i);
            }
        }
    }
}
