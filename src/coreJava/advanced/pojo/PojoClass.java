package coreJava.advanced.pojo;

public class PojoClass {

    /*
        POJO: Plain Old Java Object. A simple java object without any restrictions.

        Pojo class can be used as a data type.

        Rules for a class to be called as POJO class.
            Mandatory Rules:
                1. It must be public
                2. It should not implement any interfaces.
                3. It should not extend any class.
                4. It should not have any annotations specified.

            Optional Rules:
                1. Recommended to make the properties (instance variables) as private for security.
                2. It can have getters and setters in order to access the properties.
                3. We should not add main method.

    */
    public static void main(String[] args) {

        // Pojo class can be used as a data type to store multiple values.
        // In this example, we cannot create separate arrays for employee name, id and pay.
        // Instead, we can create a Pojo class with the same properties and use it as a data type.

        // First Employee Details.
        Employee empOne = new Employee();
        empOne.setEmployeeID(1024);
        empOne.employeeName = "Pramod";
        empOne.employeePay = 200_000_000.0;

        // Second Employee Details.
        Employee empTwo = new Employee();
        empTwo.setEmployeeID(1001);
        empTwo.employeeName = "Saatvik";
        empTwo.employeePay = 150_300_000.0;

        // Third Employee
        Employee empThree = new Employee();
        empThree.setEmployeeID(1004);
        empThree.employeeName = "Aaron";
        empThree.employeePay = 180_750_000.0;


        // Storing them in an array of data type Employee

        Employee[] employees = new Employee[] {empOne, empTwo, empThree};

        System.out.println(empOne.getEmployeeID());
        System.out.println(empOne.employeeName);
        System.out.println(empOne.employeePay);
    }

}
