package coreJava.advanced.fileOperations;

import java.io.File;
import java.io.IOException;

public class FileOutputStream {

    public static void main(String[] args) throws IOException {
        File f = new File("./sampleSix.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        System.out.println(f.createNewFile());

       java.io.FileOutputStream fos = new java.io.FileOutputStream(f);

//       fos.write(72);
//       fos.write(98);

       // To write all charecters.
        String s = "Hello Pramod";
        for(char ch: s.toCharArray()){
            fos.write((int)ch);
        }
       fos.flush();


    }
}
