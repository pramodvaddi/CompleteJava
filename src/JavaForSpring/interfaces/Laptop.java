package JavaForSpring.interfaces;

public interface Laptop {

    public void hardDisk();

    public void speakers();

    public void screenSize();

    public void keyboard();

    default void security() {
        System.out.println("McAfe Included");
    }

    static void audio() {
        System.out.println("Dolby surround");
    }



}
