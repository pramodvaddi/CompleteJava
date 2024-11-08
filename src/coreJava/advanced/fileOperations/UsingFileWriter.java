package coreJava.advanced.fileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {
    public static void main(String[] args) throws IOException {
        File f = new File("./sampleSeven.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        System.out.println(f.createNewFile());

        String s = "Hello, How are you";
        FileWriter fw = new FileWriter(f);
        fw.write(s);
        fw.flush();

    }
}
