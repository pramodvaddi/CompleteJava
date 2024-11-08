package coreJava.advanced.pojo;

import java.io.Serializable;

public class Student implements Serializable {

    private int id;
    private int marks;

    // By default, a default (non-parameterized) constructor will be created by Java.
    // But if you create any parameterized constructor, default constructor will be removed.
    // To solve this, we create both default and parameterized (if needed) constructors.

    Student() {
        System.out.println("This is a default constructor");
    }
    Student(int id){
        this.id = id;
    }

    // Creating setters and getters for our private variables.


    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }
}
