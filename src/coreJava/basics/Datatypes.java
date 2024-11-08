package coreJava.basics;

public class Datatypes {
    public static void main(String[] args) {

        /*
            Memory Chart
            1 Byte = 8 bits
            1 Kilo byte = 1024 Bytes
            1 Mega byte = 1025 Kilobytes
            1 Giga byte = 1024 Megabytes
            1 Tera byte = 1024 Gigabytes
            1 Peta byte = 1024 Terabytes
            1 Exa  byte = 1024 Petabytes
            1 Zeta byte = 1024 Exabytes

            Storage range of Data Types (in bytes)
             byte  - 8 bits
             short - 2 bytes
             int   - 4 bytes
             long  - 8 bytes

             float  - 4 bytes
             double - 8 bytes

             char    - 2 bytes
             boolean - 1 byte

             Formula to calculate range: -2(power of n - 1) to 2(power of n-1) - 1. Here, n is number of bits.
             Ex: 1 byte = 8 bits
                -2(power of 8-1) to 2(power of 8-1) - 1
                -2(power 7) to 2(power(7)) - 1
                -128 to 128 -1
                -128 to 127
        */

        // Data types in Java
        byte age = 19;
        short otp = 3223;
        int mobileNumber = 989898989;
        long number = 12342322424324L;

        float percent = 98.3F;
        double temperature = 19.23;

        char c = 's';
        boolean isQualified = true;


        // Storing values
        int x = 10, y = 120, z = 30;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // Concatenation
        String name = "Pramod";
        String city = "Hyderabad";
        System.out.println("The person name is " +name+ " Person is from " +city);
    }
}
