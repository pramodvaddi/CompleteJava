package coreJava.intermediate;

public class WhileDoWhile {


    // Looping statements are the statements which executes continuously until the given condition turns false.
    /*
        Types of Loops
            1. For Loop
            2. While Loop
            3. Do-While Loop
            4. For Each loop : Also known as extended for loop.
     */

    /*
        Debugging with break point
        1. Select a line as a break point.
        2. f5 key is to go inside the line
        3. f6 key is to go to the next line.
     */

    public static void main(String[] args) {
        // While Loop
        int Fuel = 0;
        while(Fuel <= 15){
            System.out.printf("Filling %d liters \n ", Fuel);
            Fuel++;
        }
        System.out.println("Done");

        // Do While Loop: Executes at least once
        int i = 5;
        do {
            System.out.println("I am a do while");
            i++;
        } while(i<5);


        // Assignment 1: Print 1-100 numbers.
        int a = 1;
        while(a<=100){
            System.out.println(a);
            a++;
        }

        // Assignment 2: Print even numbers between 200 and 500.
        int evenNumber = 200;
        while(evenNumber<=400){
            if(evenNumber%2==0){

                System.out.printf("%d is an Even number \n", evenNumber);

            }
            evenNumber++;
        }

        // Assignment 3: Print numbers that are divisible by 7.
        int divisibleSeven = 150;
        while(divisibleSeven <= 200){
            if(divisibleSeven % 7 == 0){
                System.out.printf("%d is Divisible by 7 \n", divisibleSeven);

            }
            divisibleSeven++;
        }

        // Assignment 4: Print prime numbers between 50 and 150.
        int primeNumber = 50;
        int temp = 1;
        while(primeNumber <=150){
            while(primeNumber/1 == primeNumber)
            System.out.println(primeNumber);
            primeNumber++;


        }


    }
}
