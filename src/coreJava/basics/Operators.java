package coreJava.basics;

public class Operators {

    // Operators in Java
    // 1. Arithmetic Operator: +, -, /, *, %
    // 2. Unary Operator: ++, --
    // 3. Relational Operator: >, <, >=, <=, ==
    // 4. Assignment Operator: =, +=, -=
    // 5. Conditional Operator: &, |


    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 20;
        System.out.println("The addition of a and b is "+ (a + b));
        System.out.println("The difference of a and b is "+ (a - b));
        System.out.println("The multiplication of a and b is "+ (a * b));
        System.out.println("The division (quotient) of a and b is "+ (a/b));
        System.out.println("The modulus (reminder) of a and b is "+ (a%b));

        //Unary Operators
        int i = 10;
        //Post Increment
        System.out.println("The value of i "+ i); // 10
        System.out.println("Post increment of i "+ i++); // 10
        System.out.println("The current value of i "+ i); // 11

        //Post Decrement
        System.out.println("The value of i "+ i); // 11
        System.out.println("Post decrement of i "+ i--); // 11
        System.out.println("The current value of i "+ i); // 10

        //Pre Increment
        System.out.println("The value of i "+ i); // 10
        System.out.println("Pre increment of i "+ ++i); // 11
        System.out.println("The current value of i "+ i); // 11

        //Pre Decrement
        System.out.println("The value of i "+ i); // 11
        System.out.println("Pre decrement of i "+ --i); // 10
        System.out.println("The current value of i "+ i); // 10

        // Relational Operators
        int x = 10;
        int y = 30;
        System.out.println("The value is x is greater than y "+ (x>y)); // False
        System.out.println("The value is x is lesser than y "+ (x<y));  // True
        System.out.println("The value is x is greater than or equals to  y "+ (x>=y)); // False
        System.out.println("The value is x is lesser than  or equals to y "+ (x<=y)); // True
        System.out.println("The value is x is same as y "+ (x==y)); // False

        // Conditional Operators
        String name = "Pramod";
        String city = "Hyderabad";
        System.out.println(name == "Pramod" & city == "Hyderabad"); // True
        System.out.println(name == "Pramod" & city == "Bangalore"); // False
        System.out.println(name == "Pramod" | city == "Hyderabad"); // True
        System.out.println(name == "Pramod" | city == "Bangalore"); // True

    }
}
