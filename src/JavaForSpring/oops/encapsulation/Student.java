package JavaForSpring.oops.encapsulation;

public class Student {
   private int rollNumber;
   private String name;
    private boolean isAttended;


    public void setAttended(boolean flag){
        isAttended = flag;
        System.out.println("Teacher assigned attendance");
    }

    public boolean getAttended(){
        System.out.println("Teacher accessed student attendance");
        return isAttended;

    }

    public static void main(String[] args) {

    }
}
