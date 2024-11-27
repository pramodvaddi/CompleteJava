package coreJava.advanced.innerClasses;

// Class declared inside method is called a local class.
public class OuterClass {


    private int id = 120;


    public static void main(String[] args) {
        int salary = 89909;

        class Income {
            public void print(){
                System.out.println("Salary is " + salary);
            }
        }

        Income inc = new Income();
        inc.print();

    }

    public void show(){
        System.out.println("Show method is called.");
    }
}
