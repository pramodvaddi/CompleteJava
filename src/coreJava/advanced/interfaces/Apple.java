package coreJava.advanced.interfaces;

public class Apple implements Laptop {

    // Abstract Method: A method which does not provide any implimentation. An imaginary thing.
    // @override is not needed. It's nor mandatory.


    @Override
    public void speakers() {
        System.out.println("Apple speakers");
    }

    @Override
    public void camera() {
        System.out.println("Facetime HD camera");
    }

    @Override
    public void copy() {
        System.out.println("Copy code");
    }

    @Override
    public void paste() {
        System.out.println("Paste code");
    }

    public void security(){
        System.out.println("Good security with face id.");
    }

    public  void cost(){
        System.out.println("Globally available");
    }




}
