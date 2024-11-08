package coreJava.advanced.inheritance;

public class Admin extends Developer{

    // Can read, write and manage
    public void manage(){
        super.read();
        System.out.println("Manage");
    }

    public void read() {
        System.out.println("Admin read");
    }
}
