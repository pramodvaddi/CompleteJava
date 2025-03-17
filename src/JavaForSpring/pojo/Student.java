package JavaForSpring.pojo;

import java.io.Serializable;

public class Student implements Serializable {
    private int iD;
    private String name;
    private double marks;

    public Student(){
        System.out.println("No args constructor");
    }


    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
