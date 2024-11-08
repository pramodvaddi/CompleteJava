package coreJava.advanced.interfaces;

public class Lenovo implements Laptop{


    @Override
    public void speakers() {
        System.out.println("Bose speakers");
    }

    @Override
    public void camera() {
        System.out.println("4k HD camera");
    }

    @Override
    public void copy() {
        System.out.println("Copy Lenovo");
    }

    @Override
    public void paste() {
        System.out.println("Paste Lenovo");

    }

    // Adding extra method which is not in Laptop interface.
    public void bluetooth() {
        System.out.println("Bluetooth available.");
    }
}
