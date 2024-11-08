package coreJava.basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Taking input from the user.

        // String input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Good Morning "+ name);

        // Int input
        System.out.println("What is your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: "+age);

        // Float input
        System.out.println("What is your percentage: ");
        float percent = sc.nextFloat();
        System.out.println("Your percentage is: "+percent);



    }
}
