package coreJava.advanced.typeconversion;

public class Conversion {
    // Type Conversion: Converting data of one type to another.
    // Two Types: Implicit (Automatic or Widening or Upcasting). Explicit (Manual or Narrowing or Down casting)

    public static void main(String[] args) {
        byte b = 10;
        short sh = 300;
        int age =  121343;
        long number = 8898989L;

        float percent = 98.6F;
        double pie = 3.141;

        char ch = 'd';

        boolean isIndian = true;

        // Implicit: Storing or converting smaller data type to larger.
        sh = b;
        System.out.println(sh); // 10

        // Explicit: Storing or converting larger to smaller.
        sh = (short) age;
        System.out.println(sh); // data loss

        int num = (int) pie;
        System.out.println(num);

    }

}
