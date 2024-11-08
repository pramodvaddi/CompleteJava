package coreJava.advanced.inheritance;

public class User {
    public static void main(String[] args) {
        Admin official = new Admin();
        official.write();
        official.manage();
        official.read();



    }
}
