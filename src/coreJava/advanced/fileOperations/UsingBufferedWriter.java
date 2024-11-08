package coreJava.advanced.fileOperations;

import java.io.*;

public class UsingBufferedWriter {
    public static void main(String[] args) throws IOException {
        File f = new File("./sampleEight.txt");
        f.createNewFile();

        String existingText = "Hello ";
        String line = new String();

        // To update, first we need to read the file.
        BufferedReader br = new BufferedReader(new FileReader(f));
        while((line = br.readLine()) !=null) {
                existingText += line + "\n";
        }
        System.out.println(line);

        String s = "Sameera Pramod";
        BufferedWriter bfw = new BufferedWriter(new FileWriter(f));
        bfw.write(existingText + s);
        bfw.flush();


    }
}
