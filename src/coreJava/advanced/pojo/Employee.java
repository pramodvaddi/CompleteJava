package coreJava.advanced.pojo;

public class Employee {

    private int employeeID;
    public String employeeName;
    protected double employeePay;

    Employee(){
        System.out.println("Non parameterized constructor");
    }

    Employee(int employeeID){
        this.employeeID = employeeID;
    }

    public void setEmployeeID(int id){
        this.employeeID = id;
    }

    public  int getEmployeeID(){
        return employeeID;
    }
}
