package coreJava.advanced.interfaces;

public class User {

    public static void main(String[] args) {

        Apple macbookAir = new Apple();
        macbookAir.camera();
        macbookAir.copy();
        macbookAir.speakers();
        macbookAir.paste();
        macbookAir.security();
        macbookAir.cost();

        Lenovo notepad = new Lenovo();
        notepad.bluetooth();
        notepad.camera();
        notepad.speakers();
        notepad.paste();

    }
}
