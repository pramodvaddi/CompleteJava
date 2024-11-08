package coreJava.intermediate;

public class Strings {

    // String: Sequence of characters.
    // String is a class in Java, considered as literal due to its unique behaviour.
    // Two ways to declare a String.
    // 1. String sOne = "Pramod";
    // 2. String sTwo = new String("Pramod");

    // If you print an object for a class, it will give you an address.
    // But if you print the object created for String, it will output the value assigned to that String.
    // This uniqueness made Strings to be considered as literals.

    /*
        String s1 = "Pramod";
        String s2 = new String("Pramod");
        Here, despite the values being same, s1 is not equal to s2.

        s1 value will be stored separately in String pool memory.
        s2 will be stored in Heap memory.
        Thus, both are not same.

        In String pool, if the values assigned to two different variables are same, then new memory for that value will not be created in String pool.
        In Heap memory, even if the values are same, different memory spaces will be created inside Heap.

    */

    // When you use == to compare the values of two strings, their respective addresses will be verified.
    // When you use .equals() method, the values will be verified.
    public static void main(String[] args) {
        String name = "Pramod";
        String newName = "praMod";

        // Using equals and equalsIgnoreCase.
        System.out.println(name.equals(newName)); // False
        System.out.println(name.equalsIgnoreCase(newName)); // True

        // Using Contains
        System.out.println(name.contains("P")); // True
        System.out.println(name.contains("p")); // False

        // Using startsWith and endsWith
        System.out.println(name.startsWith("Pr")); // True
        System.out.println(name.endsWith("od")); // True

        // Using length. Space counts.
        System.out.println(name.length()); // 6

        // Using Trim. Removes space at the leading and the trailing, but not in between.
        String greet = " Good Morning   ";
        System.out.println(greet.trim()); // Good Morning

        // Using toUpperCase and toLowerCase
        System.out.println(name.toUpperCase()); // PRAMOD
        System.out.println(name.toLowerCase()); // pramod

        // Using toCharArray
        System.out.println(name.toCharArray()); // [ 'P', 'r', 'a', 'm', 'o', 'd' ]

        // Using indexOf: First occurrence . lastIndexOf: Last Occurrence.
        String wish = "Good Morning";
        System.out.println(wish.indexOf("o")); // 1
        System.out.println(wish.lastIndexOf("o")); // 6

        // Using substring
        System.out.println(wish.substring(2)); // Starts from index 2 and prints till the last.
        System.out.println(wish.substring(2,5)); // Starts from index 2 and prints till index 5.

        // Using split.
        // System.out.println(Arrays.toString(wish.split(" ")));
        System.out.println(wish.split(" ")); // This will output memory address.

        // Using CharAt
        System.out.println(wish.charAt(0)); // G

        // Using replace
        System.out.println(wish.replace("Morning", "Evening")); // Good Evening.

        // Using valueOf: To convert the type
        String age = "18";
        int changeAge = Integer.valueOf(age);
        System.out.println(changeAge);

        // Using isEmpty: Counts white spaces.  isBlank:
        String s1 = " ";
        String s2 = "   ";
        System.out.println(s1.isEmpty()); // False: We have a white space
        System.out.println(s2.isBlank()); // True: Performs trim(). Removes white spaces. 
    }
}