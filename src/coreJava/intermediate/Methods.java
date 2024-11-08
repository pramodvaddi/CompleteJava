package coreJava.intermediate;

public class Methods {
    // Like variables, we have two types of methods.
    // Instance method
    // Static method

    // Instance Method.
    public void message(){
        System.out.println("How are you?");
    }

    // Static Method.
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
        System.out.println("Your balance after withdrawal is " + withdraw(20));
        System.out.println("Your balance after deposit is " + deposit(30));

        new Methods().message();
    }
}
