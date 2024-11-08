package coreJava.basics;

public class TypeCasting {

    public static void m1(){
        System.out.println("Hello from other file");
    }
    public static void main(String[] args) {

        // Widening Casting: lower to higher
        int age = 19;
        double castedAge = age;
        System.out.println(castedAge);

        // Narrowing Casting: higher to lower
        double weather = 14.8;
        byte rounded = (byte) weather;
        System.out.println(rounded);
    }
}
