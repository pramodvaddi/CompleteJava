package JavaForSpring.interfaces;

public class Lenovo implements Laptop{
    @Override
    public void hardDisk() {
        System.out.println("256 GB");
    }

    @Override
    public void speakers() {
        System.out.println("Bose Speakers");

    }

    @Override
    public void screenSize() {
        System.out.println("17 inch");

    }

    @Override
    public void keyboard() {
        System.out.println("QWERTY");

    }

    @Override
    public void security(){
        System.out.println("Lenovo inbuilt security");
    }
}
