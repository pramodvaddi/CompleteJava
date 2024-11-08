package coreJava.intermediate;

public class Objects {
    // Object is an instance of a class.
    // We create object to allocate memory to a class.
    // Every object we create will be different.

    int a = 100;
    int b = 200;

    public Objects(){
        System.out.println("I am a default class");
    }

    public Objects(int a, int b){
        this.a = a;
        this.b = b;

    }


    public void add(int a, int b){
        System.out.println("The addition is "+ (a+b));;
    }

    public static void main(String[] args) {

        Objects t1 = new Objects();
        Objects t2 = new Objects(15,20);


        System.out.println(t1.a);
        System.out.println(t1.b);
        System.out.println("The Multiplication is "+ (t1.a * t1.b));

        t2.add(10,10);
        t1.add(2,2);

    }


}
