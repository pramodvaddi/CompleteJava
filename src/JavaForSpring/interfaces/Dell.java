package JavaForSpring.interfaces;

public class Dell implements Laptop {

    @Override
    public void hardDisk() {
        System.out.println("512 GB");
    }

    @Override
    public void speakers() {
        System.out.println("JBL Supersonic");

    }

    @Override
    public void screenSize() {
        System.out.println("13 Inch");

    }

    @Override
    public void keyboard() {
        System.out.println("Slim line QWERTY");

    }

    // Extra method. This is not in the interface we implemented.
    public void hdmiPort() {
        System.out.println("One HDMI will be provided");
    }
}
