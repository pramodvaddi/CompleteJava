package JavaForSpring.oops.inheritance;

public class User {
    public static void main(String[] args) {
        Guest ram = new Guest();
        // Ram cannot write and manage
        ram.read();

        Developer pramod = new Developer();
        // Pramod can write and read. But cannot add and delete.
        pramod.write();
        pramod.read();

        Admin arun = new Admin();
        // Arun can do read, write and manage.
        arun.manage();
        arun.read();
        arun.write();

    }
}
