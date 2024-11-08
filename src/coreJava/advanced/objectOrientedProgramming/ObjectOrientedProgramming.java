package coreJava.advanced.objectOrientedProgramming;

public class ObjectOrientedProgramming {
    int mobileNumber = 1234;

    // OOPs: Object-Oriented Programming System is the programming paradigm based on the concepts of Objects.
    // Programming Paradigm: It as an approach to solve problem using a programming language.

    // Types of Programming Paradigm: Imperative (How to do) and Declarative (What to do).
    // Imperative Programming: Procedural, Structural, Object-Oriented
    // Declarative Programming: Functional, Database, Logical.


    // Principles of OOP: Inheritance, Encapsulation, Polymorphism, Abstraction.
    // Java is not 100% OOP language as it supports Primitive data types and Static.
    // Simula is the first OOP language
    // SmallTalk is the first 100% OOP language
    
    public static void main(String[] args) {
        // Creating Objects for Class ObjectOrientedProgramming
        ObjectOrientedProgramming objectOne = new ObjectOrientedProgramming();
        System.out.println(objectOne.mobileNumber);

        // Creating Object for Class A
        A objectTwo = new A();
        System.out.println(objectTwo.greet());
        objectTwo.add(10,10);

        // Creating Object for Class B
        B objectThree = new B();
        System.out.println(objectThree.age);

    }
}

class A {

    // Static Method
    static void add(int a, int b){
        System.out.println(a+b);
    }

    static String greet(){
        return "Good Morning";
    }
}

class B {
    int age = 12;
}