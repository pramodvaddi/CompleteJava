package JavaForSpring.oops.inheritance;

public class Admin extends Developer {

    public void manage(){
        super.read();
        System.out.println("Add and Delete");
    }

    public void read(){
        System.out.println("Admin personal read access.");
    }

}
