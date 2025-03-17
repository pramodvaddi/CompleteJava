package JavaForSpring.pojo;

public class Program {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setiD(101);
        emp.setName("Pramod");
        emp.setSalary(200_000);

        System.out.println(emp.getiD());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());

        Employee empTwo = new Employee();
        empTwo.setiD(102);
        empTwo.setName("Rebecca");
        empTwo.setSalary(240_000);

        Employee empThree = new Employee();
        empThree.setiD(103);
        empThree.setName("Negan");
        empThree.setSalary(200_120);


        // Creating an array to store employees
        Employee[] employees = new Employee[] { emp, empTwo, empThree};





    }
}
