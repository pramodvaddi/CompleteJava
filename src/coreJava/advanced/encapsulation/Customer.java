package coreJava.advanced.encapsulation;

import java.util.Scanner;

public class Customer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account customerOne = new Account();
        customerOne.name = "Pramod";
        customerOne.city = "Hyderabad";


        System.out.printf("Welcome Mr. %s \n", customerOne.name);
        System.out.println("Your current balance is ");
        System.out.println(customerOne.setAccountBalance(2000));

        System.out.println("Make you selection \n1. Check Balance CB \n2. Add Balance AB");
        String userSelection = sc.nextLine();

        if(userSelection.equals("Check Balance")){
            System.out.println("Your Current Balance is ");
            System.out.println(customerOne.setAccountBalance(2000));
        } else if (userSelection.equals("Add Balance")){
            System.out.println("Enter amount to deposit ");
            customerOne.depostiedAmount = sc.nextFloat();
            System.out.println("Your current balance after deposit is ");
            System.out.println(customerOne.getAvailableBalance());
        } else {
            System.out.println("Make a valid selection");
        }

    }
}
