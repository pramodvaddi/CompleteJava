package coreJava.advanced.fileOperations;

import java.io.File;
import java.io.IOException;

public class FileHandling {

    /*
        Two types of Path
            1. Absolute Path: Full path with entire location.
            2. Relative Path: Using .,

         Separators: / \

         File Operations
            1. Create new file: f.createNewFile();
            2. Delete file: f.delete();
            3. To check if file exists: f.exists();
            4. To check if file is hidden: f.isHidden();
            5. To check if file is read only: f.canWrite();
            6. To give writing permission: f.setWritable(true);
            7. To return all files in a directory Array.toString(f.list());
            8. To return all files with path in a directory Array.toString(f.listFiles());

            ./ refers to current directory

            For File Reading,
                1. FileInputStream
                2. FileReader
                3. Scanner
                4. BufferedReader

            For File Writing,
                1. FileOutputStream
                2. FileWriter
                3. BufferedWriter

            Scanner is not used for writing data, it is used to read data.
    */
    public static void main(String[] args) throws IOException {

        // Absolute path
        //File f = new File("//Users/pramodvaddiraju/Downloads/javaFileOperations/myStory.txt");

        // To create file in this current project folder.
        File f = new File("./currentFile.txt");

        // To create folder in this current project folder.
        // File f = new File("./Resources");
        //  f.mkdir();


        if(f.exists()){
            f.delete();
        }
        System.out.println(f.createNewFile());

        System.out.println(f.createNewFile());
        //System.out.println(f.delete());



    }
}
