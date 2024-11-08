package problemSolving;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        // Check if a given character is a vowel or consonant.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String ch = sc.next();
        if(ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u")){
            System.out.println("Its a Vowel");
        } else {
            System.out.println("Its a Consonant");
        }
    }
}
