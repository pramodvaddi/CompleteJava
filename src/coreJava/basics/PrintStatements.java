package coreJava.basics;

public class PrintStatements {
    // Types of print statements.
    // Three types: print, println, printf

    public static void main(String[] args) {
        // print
        System.out.print("Hello");
        System.out.print("John");

        // println
        System.out.println("You are from ");
        System.out.println("London");

        // printf
        //%	Percent
        //n	Line break
        //b or B	Boolean
        //s or S	String
        //d	Decimal integer
        System.out.printf("Hello, the age is %s", 98);

        // Prinintnig error message
        System.out.println();
        System.err.println("This is an error message");
    }
}
