package coreJava.advanced.fileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class UsingScanner {
    // Scanner: Scanner will give you line by line text.

    // To check if there is any token, use hasNext.
    // To check if there is any line, use hasNextLine.

    public static void main(String[] args) throws IOException {
        File f = new File("./sampleTwo.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        System.out.println(f.createNewFile());


        Scanner sc = new Scanner(f);
        String text = new String();
        while(sc.hasNext()){
            text += sc.nextLine() + "\n";

        } System.out.print(text);

        sc.close();
    }
}
