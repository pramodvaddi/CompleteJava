package coreJava.intermediate;

import java.util.Locale;
import java.util.Scanner;

public class DecisionMaking {
    // Three types of Decision-making statements
    // If, If else, Nested if.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your preferred country to travel: ");
        String country = sc.nextLine();
        System.out.print("Enter your preferred city to visit: ");
        String city = sc.nextLine();

        if(country.equals("United States")){
            System.out.printf("You have chosen %s to visit \n", country);
            System.out.printf("You have chosen %s city to visit\n", city);
            if(city.equals("New york")){
                System.out.println("Concrete jungle");
            } else if(city.equals("Los Angeles")){
                System.out.println("Expensive");
            } else {
                System.out.println("Enter a valid city");
            }

        } else if(country.equals("India")){
            System.out.printf("You have chosen %s to visit\n", country);
            System.out.printf("You have chosen %s city to visit\n", city);
            if(city.equals("Hyderabad")){
                System.out.println("Biryani people");
            } else if(city.equals("Bangalore")){
                System.out.println("IT Hub");

            } else {
                System.out.println("Enter a valid city");
            }
        } else {
            System.out.println("Enter a valid country");
        }

        // Switch Cases: Value based execution.
        String weekday = sc.nextLine();
        switch (weekday){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                System.out.println("Uff, its weekday");
                break;
            case "Saturday", "Sunday":
                System.out.println("Yay, its weekend");
                break;
            default:
                System.err.println("Invalid input");
        }
        // Switch Case Assignment 1:
        System.out.println("Enter a number to check if its even or odd");
        int evenChecker = sc.nextInt();
        int resultNum = evenChecker%2;
        System.out.println(resultNum);

        switch (resultNum) {
            case 0:
                System.out.println("Even Number");
                break;
            default:
                System.out.println("Odd Number");
        }

        // Assignment 1. Finding Even Number
        System.out.println("Enter a number to check weather it is even or odd");
        int checkNum = sc.nextInt();
        if(checkNum % 2 == 0){
            System.out.printf("You have entered %d and it is an even number",checkNum);

        } else {
            System.out.printf("You have entered %d and it is an odd number",checkNum);
            System.out.println();
        }

        // Assignment 2. Finding student grade.
        System.out.println("Enter your marks to check your stats");
        int marks = sc.nextInt();
        if(marks > 90){
            System.out.println("You have scored really well. Grade Outstanding");
        } else if(marks <90 & marks >=80){
            System.out.println("You have scored second class");
        } else if(marks < 80 & marks >= 70){
            System.out.println("You have scored in between 70 and 80");
        } else if(marks < 70 & marks >= 50){
            System.out.println("Work to improve your scores");
        } else {
            System.out.println("Prepare well again");
        }

        // Assignment 3: Printing days of the week.
        System.out.print("Enter the day of the week: ");
        String day = sc.nextLine();
        if (day.equals("Monday")| day.equals("Tuesday")| day.equals("Wednesday")| day.equals("Thursday")| day.equals("Friday")) {
            System.out.println("Huh...Working days");
        } else {
            System.out.println("Yay! its weekend");
        }
    }
}
