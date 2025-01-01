package coreJava.advanced.bufferBuilder;

public class Strings {
    // Strings are immutable
    // StringBuffer (Synchronised, Multi-Threaded environment) and StringBuilder (Single-Threaded environment) are mutable.

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Pramod");
        StringBuffer sb2 = new StringBuffer("Pramod");
        System.out.println(sb1 == sb2 );

        sb1 = sb1.append("Vaddiraju");
        System.out.println(sb1 == sb2);



        String s1 = "Pramod";
        String s2 = "Vaddiraju";
        String s3 = "Pramod";

        System.out.println(s1 == s3);

        // Operations: Default capacity without value is 16.
        StringBuilder sbd = new StringBuilder("Pramod");
        sbd.insert(1, "Vaddiraju");
        System.out.println(sbd);

        // delete
        sbd.delete(0,3);
        System.out.println(sbd);

        // reverse
        sbd.reverse();
        System.out.println(sbd);

        // charAt()
        sbd.charAt(1);
        System.out.println(sbd);

        // Capacity. By default, StringBuilder capacity is 16. If you add any data, the capacity will increase from 16.
        System.out.println(sbd.capacity());

        // To start StringBuilder with your own capacity
        sbd.ensureCapacity(100);




    }
}
