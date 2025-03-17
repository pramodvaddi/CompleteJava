package JavaForSpring.oops.polymorphism;

public class Calculations {

    // Method Overloading
    // Same method name with differentiation in : Type of parameters, Order of parameters, Number of parameters.
    // Best example of Method overloading is our print statement (sout).
    public void add(int a, int b){
        // add code here
    }

    public void add(int a, int b, int c){
        // add code here
    }

    public static void main(String[] args) {
        Calculations cal = new Calculations();
        cal.add(2,3);
        cal.add(1,4,3);


    }

}
