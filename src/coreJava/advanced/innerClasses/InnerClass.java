package coreJava.advanced.innerClasses;

public class InnerClass {

    /*
        1. Can we have more than one class in a Java file?
        A. Yes.

        2. Can we have more than one public class?
        A. No.

        3. How many class files will be generated when multiple class files are present in Java?
        A. If you have 3 classes, 3 class files are generated.

        4. Can we have main method in all classes present at root level of Java file?
        A. Yes. All class files will be compiled but while executing the Java file, we have to choose the main method which you want to run.

        5. If a Java file contains more than one class at the root level, are they considered as inner classes?
        A. No, Inner class is a class which is inside the class.

        6. What is an inner class?
        A. If a class is inside a class as a member, then it is called as inner class.

        7. How many types of inner classes are there in Java?
        A. There are 4 inner classes,
            1. Non-Static inner class
            2. Static inner class.
            3. Local inner class.
            4. Anonymous inner class.

        8. Can we have more than one inner class inside a class?
        A. Yes, but the names must be unique.

        9. How can we differentiate between an inner class and outer class.
        A. Outer class name will be straight forward (InnerClass.class) and inner class naming will be quite different. (InnerOne$InnerClass.class) .

        10. Can we create a public/private/protected inner class?
        A. Yes.

        11. Can we create static/abstract/final inner class?
        A.  Yes.

        12. Can we create a main method inside inner class?
        A. No.

        13. How to access outer class variables when they are duplicated in inner class?
        A.
    */


    public static void main(String[] args) {

    }
}

class AnotherClassOne {
    static String className = "Second class";

    // Creating inner classes
    class InnerOne {
        public void greet(){
            System.out.println("Hello");
        }
        private int age(){
            return 19;
        }


    }

    public static void main(String[] args) {
        System.out.println(className);

        // Creating object for outer class
        AnotherClassOne obj = new AnotherClassOne();

        // Creating object for inner class
        InnerOne objInner = new AnotherClassOne().new InnerOne();

        System.out.println(objInner.age());
        objInner.greet();

        // ExampleInner class execution

        ExampleInner otherFileObj = new ExampleInner() {
            @Override
            public void giveExam() {
                System.out.println("Exam given...");
            }

        };


    }



}

abstract class AnotherClassTwo extends ExampleInner {
    static String className = "Third class";

    public static void main(String[] args) {
        System.out.println(className);
    }

    @Override
    public int getMarks() {
        return super.getMarks();
    }

    @Override
    public void getAttendance() {
        super.getAttendance();
    }
}
