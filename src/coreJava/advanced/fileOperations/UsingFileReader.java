package coreJava.advanced.fileOperations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// File input stream and File reader are almost same.
// Scanner will give you line by line text
// FileInputStream and FileReader will give you characters which can be later converted to String.
// BufferedReader will give you option to chose between line by line like Scanner and char wise like FileInputReader and FileReader.

public class UsingFileReader {

    public static void main(String[] args) throws IOException {
        File f = new File("./sampleThree.txt");
        if(!f.exists()){
            f.createNewFile();
        }

        FileReader fr = new FileReader(f);
        int asciiCode;
        String text = new String();
        while((asciiCode = fr.read()) != -1){
            text += String.valueOf((char)asciiCode);
        }
        System.out.println(text);
        fr.close();
    }

}
