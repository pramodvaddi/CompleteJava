package coreJava.basics;

public class Comments {

    // Single line comments

    // Multi line comments. We use /*
    /*
    This
    is a
    multi line
    comment
     */

    // Documentation Comments. We use /**
    /**
     * @author Pramod Vaddiraju
     * @version 1.1.0
     * @param a b
     *          This method will perform addition.
     */
    static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(add(10,20));
    }
}

/*
    Shortcuts
    Single line comment: Select the line and press cmd+/
    Multi line comment: Select the lines and press cmd+shift+/
                        To uncomment: cmd+shift+\
    Documentation comment: Will be created only at class level. Press shift+alt+j
 */