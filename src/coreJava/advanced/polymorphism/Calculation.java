package coreJava.advanced.polymorphism;

public class Calculation extends Polymorphism{

    // In a class, methods must be unique, duplicates not allowed.
    // Rules to overcome this, we use Method Overloading.
    // Method Overloading: Same method name with different type of parameters or number of parameters or order of parameters.

    // Sout or println are best examples of Method Overloading.
    public void add(int a, int b){
        System.out.println(a+b);
    }

    public  void add(double a, double b){
        System.out.println(a+b);
    }

    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    @Override
    public void methodOverriding(){
        System.out.println("Overriding done");
    }

    public static void main(String[] args) {
       Calculation calc = new Calculation();

       calc.add(2,3);
       calc.add(9.4, 9.8);
       calc.add(1,2,3);


       calc.methodOverriding();
    }


}
