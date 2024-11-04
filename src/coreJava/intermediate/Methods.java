package com.part.intermediate;

public class Methods {

    static void greet(){
        System.out.println("Hello, welcome to International Bank");
    }

    static void totalBalance(){
        System.out.println("You have 100 in your account");

    }
    static int withdraw(int draw){
        int balanceAfterWithdraw = 100 - draw;
        return balanceAfterWithdraw;
    }
    static int deposit(int addMoney){
        int balanceAfterDeposit = 100 + addMoney;
        return balanceAfterDeposit;
    }

    public static void main(String[] args) {
        greet();
        totalBalance();
        System.out.println("Your balance after withdrawl is "+withdraw(20));
        System.out.println("Your balance after deposit is " + deposit(30));


    }
}
