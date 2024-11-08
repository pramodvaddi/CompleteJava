package coreJava.intermediate;

import java.util.Scanner;

public class Arrays {
    // We have two type of data, Primitive and Non-Primitive.
    // For Primitive type data, we don't need to create any object to access or perform any operations on it.
    // This is why Java is not fully Object-Oriented Programming language.
    // For Non-Primitive data types, we have to create objects.
    // Array is a non-primitive data type.
    // Array is a container object that can hold fixed number of values of single type.

    /*
       There are two types of Array
            1. Single Dimensional (Linear Array): One row and n number of columns.
            2. Multi Dimensional: Also known as a combination of single dimensional array.
                 1. Two Dimensional Array
                 2. Jagged Array
    */

    // To create an array, we don't have any specific keyword. But we have a special way to create an array, that is [].
    // Defining an Array can be done in two ways. int[] a; or int a[];
    // To specify size to an array, we need to create an object.


    public static void main(String[] args) {

     /*
        Different ways to create an Array,
         1. int ids[] = new int[5];
         2. int[] ids = {23,34,22,23,43};
         3. int[] ids;
            ids = new int[5];
      */

        int ids[] = new int[5];
        ids[0] = 2902;
        ids[1] = 3490;
        ids[2] = 2989;
        ids[4] = 1123; // We skipped 3 here, so the int default value 0 will be here.

        System.out.println(ids[1]);
        System.out.println(ids[3]);
        System.out.println(ids[4]);

        // Using loop to print all at a time
        for(int i = 0; i < ids.length; i++){
            System.out.println("I am from for loop "+ ids[i]);
        }

        // Using while loop to print at a time.
        int x = 0;
        while(x<ids.length){
            System.out.println("I am from while loop "+ ids[x]);
            x++;
        }



    }
}
