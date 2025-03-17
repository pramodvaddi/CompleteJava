package coreJava.advanced.wrapperclass;

import java.util.ArrayList;

public class WrapClass {
    // Because of primitive data types, Java is not 100% OOP language.
    // Primitive data types cannot be used with collections.
    // Class wrapping a primitive data types is called Wrapper class.
    // For all the primitive data types, we have wrapper class.

    // Byte, Short, Integer, Long, Float, Double, Character, Boolean

    public static void main(String[] args) {
        int personAge = 18;
        WrapClass wp = new WrapClass();

        // Boxing
        Integer age = Integer.valueOf(personAge);
        System.out.println(age);

        // Auto Boxing: Directly Assigning
        Integer i2 = personAge;

        // Unboxing: Wrapper class to primitive
        Integer ab = Integer.valueOf(40);
        int abc = ab.intValue();

        // Auto-Unboxing: Directly Assigning
        Integer cb = Integer.valueOf(100);
        int cbb = cb;

        ArrayList<Integer> ages = new ArrayList<>();
        // Boxing
        ages.add(Integer.valueOf(23));
        ages.add(Integer.valueOf(22));
        ages.add(Integer.valueOf(43));

        // Auto Boxing
        ages.add(18);
        ages.add(98);
        ages.add(12);



    }

}
