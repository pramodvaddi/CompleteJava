package coreJava.advanced.switchExpression;

public class SwitchEx {

    // In Switch cases, we use break keyword for every case.
    // Arrow switch is supported from Java Version 14.



    public static void main(String[] args) {
        int number = 0;

        // Switch Statement 
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Positive");
                break;
            case -1:
                System.out.println("Negative");
                break;
        }

        // Switch Expression
        int age = 18;
        switch (age){
            case 14 -> System.out.println("You are 14");
            case 15 -> System.out.println("You are 15");
            case 18 -> System.out.println("You are 18");


        }


    }
}
