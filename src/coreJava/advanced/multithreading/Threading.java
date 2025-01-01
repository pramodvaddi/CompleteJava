package coreJava.advanced.multithreading;

public class Threading {
    /*

     Multi-Threading: Executing multiple thread.
     By default, there will be a thread in Java program, i.e, main.

     To create a new thread, create an instance for the thread class.

     To make the thread dependent on other: t1.join();
     To stop a thread for some time: t1.sleep(10000); milliseconds

     Thread Life Cycle
        0. new
        1. runnable
        2. blocked
        3. waiting (join)
        4. waiting (sleep)
        5. terminated

        .getState() will give you which state the thread present in.
    */

    public static void main(String[] args) {
        System.out.println("Multi-Threading");

        // Thread Name
        System.out.println(Thread.currentThread().getName());

        // Active threads
        System.out.println(Thread.activeCount());

        // Thread Id
        System.out.println(Thread.currentThread().getId());

        // Priority: 0 - 1 where 10 is highest.
        System.out.println(Thread.currentThread().getPriority());

        // Creating a Thread.
        Thread t1 = new Thread();
        System.out.println(Thread.activeCount());

        // Start/run a thread: By default, start command will run the thread.
        t1.start();

        // Creating Object for Employee class
        Employee emp = new Employee("T1");
        emp.run();
        System.out.println(Thread.activeCount());


        // Creating Object for Manager class
        Manager man = new Manager("T2");
        man.run();
        System.out.println(Thread.activeCount());

        // Interface
        Developer dev = new Developer();
        Thread th1 = new Thread(dev);
        th1.start();

        // Runnable is a functional interface, lets use lambda
        Runnable r1 = () -> {
            System.out.println("Hello Lambda " + Thread.currentThread().getName());
        };
        System.out.println();
        r1.run();





    }
}

class Employee extends Thread {

    Employee(String tName){
        super(tName);
    }

    @Override
    public void run(){
        System.out.println("Hello Employee" + Thread.currentThread().getName() + Thread.currentThread().getId());
    }
}

class Manager extends Thread {

    Manager(String tName){
        super(tName);
    }
    @Override
    public void run(){
        System.out.println("Hello Manager"+ Thread.currentThread().getName() + Thread.currentThread().getId());
    }
}

class Developer implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello Developer " + Thread.currentThread().getName());
    }
}