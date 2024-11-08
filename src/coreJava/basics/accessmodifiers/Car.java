package coreJava.basics.accessmodifiers;

public class Car {

    // Public Variable
    public String name = "Pramod";

    //Public Method
    public void greet(){
        System.out.println("Good Morning From Class Car");
        System.out.println(name);
    }

    private int balance = 1212312;

    private void phonePin(){
        System.out.println("1234");
        greet();
    }


}
