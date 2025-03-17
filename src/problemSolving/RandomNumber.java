package problemSolving;

import java.util.Scanner;
import java.util.Random;

class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Pramod's Number Guessing Game");

        System.out.print("Hello Human, Guess the number: ");
        int humanBox = scanner.nextInt();
        int computerBox = random.nextInt(10) + 1; // Random number between 1 and 10

        System.out.println("Number guessed by human: " + humanBox);
        System.out.println("Number in computer's mind: " + computerBox);

        if (humanBox == computerBox) {
            System.out.println("Numbers matched. You are the winner!");
        } else {
            System.out.println("Try again...");
        }

        scanner.close();
    }
}
