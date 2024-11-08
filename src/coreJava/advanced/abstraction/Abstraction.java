package coreJava.advanced.abstraction;

import coreJava.advanced.interfaces.AbstractClass;
import coreJava.advanced.interfaces.Laptop;
import coreJava.advanced.interfaces.Lenovo;

public class Abstraction {

    /*
        Abstraction: It is a process of hiding the implementation details and showing only functionality to the user.
        Using interfaces and abstract classes, we can achieve Abstraction.

        Before Java 8, we can achieve 100% abstraction using Interfaces.
        After Java 8, 100% achievement is based on User. If he doesn't provide any implementation. (Default and Static methods introduced in Java 8).

        When you have implementation, there is a reduction in percentage of Abstraction.

    */
    public static void main(String[] args) {

        // Without interface: If you click on the camera(), you will see the implementation.
        Lenovo padPro = new Lenovo();
        padPro.camera();


        // With interface: If you click on camera(), you cannot see the implementation.
        Laptop Hp = new Lenovo();
        Hp.camera();
        // Here, if you click on security(), you will see the implementation, we are losing some abstraction. Refer line 14.
        Hp.security();




    }
}
