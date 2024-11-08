package coreJava.advanced.fileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Scanner will give you line by line text
// FileInput reader and FileReader will give you characters which can be later converted to String.
// BufferedReader will give you option to chose between line by line like Scanner and char wise like FileInputReader and FileReader.

public class BufferReader {

    public static void main(String[] args) throws IOException {

        File f = new File("./sampleFout.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String line = new String();
        String text = new String();

        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        fr.close();
        br.close();



    }
}
