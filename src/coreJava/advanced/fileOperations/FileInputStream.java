package coreJava.advanced.fileOperations;

import java.io.File;
import java.io.IOException;

public class FileInputStream {

    /*
    Different ways of reading data from the text file.
        1. File Input Stream: FileInputStream will give you characters which can be later converted to String.To read we use input stream and to write the data we use output stream.
        2. Scanner: Scanner will give you line by line text.
        3. FileReader: FileReader will give you characters which can be later converted to String.
        4. BufferedReader: BufferedReader will give you option to chose between line by line like Scanner and char wise like FileInputReader and FileReader.

    */

    public static void main(String[] args) throws IOException {
        // Creating instance.
        File file = new File("./fileInputStream.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        System.out.println(file.createNewFile());


        java.io.FileInputStream fis = new java.io.FileInputStream(file);

        int asciiCode;
        String s = new String();
        while((asciiCode = fis.read()) != -1){
            s += String.valueOf((char)asciiCode);

        }
        System.out.println(s);
        fis.close();
    }
}
