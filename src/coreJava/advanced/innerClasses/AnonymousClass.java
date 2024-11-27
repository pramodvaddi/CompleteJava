package coreJava.advanced.innerClasses;

public class AnonymousClass {

    public static void main(String[] args) {
        ClassOne clsOne = new ClassOne() {
            public void print(){
                System.out.println("Print method updated...");
            }

        };


        clsOne.show();
        clsOne.print();

        ClassOne clsTwo = new ClassOne(){
            public void show(){
                System.out.println("Good morning..");
            }
        };
        clsTwo.show();


    }
}

class ClassOne {
    public void show(){
        System.out.println("Show..");
    }
    public void print(){
        System.out.println("Print now..");
    }
}
