package coreJava.basics;

public class TypeInference {

    // Type Inference: This is a concept in which compiler infers(chooses) the type of the variable using the value provided.
    // This type inference is restricted to local variables.
    // This feature is introduced in Java 10.
    // Var keyword is introduced in Java
    // We can use this for the versions after 10.
    // We cannot use var keyword for the older versions.

    // We use data type to tell the compiler what kind of data you are storing inside variable.
    // Compiler is now smart, when you initialise a variable using Var, compiler will automatically decide what kind if data you ae storing.

    // Restrictions of using Var keyword.
    // 1. Var can be used only for local variables. (Variables created inside Method/Constructor/Block)
    // 2. Var shouldn't be used for declaration purpose. We have to initialize completely. Ex.: var age = 12;
    // 3. Var cannot be used in in-line array initialization.

    // Static Block
    static {
        var country = "India";
        System.out.println(country);
    }

    // Non-Static Block
    {
        var city = "Hyderabad";
        System.out.println(city);
    }

    // Static Method
    static int addition(int a, int b){
        var result  = a + b;
        return result;
    }

    // Instance Method
    void greet(){
        var wishes = "Good Morning";
        System.out.println(wishes);
    }

    public static void main(String[] args) {

        TypeInference object = new TypeInference();

        // Calling Instance Method with the object.
        object.greet();

        // Calling Static Method
        addition(10,20);
        System.out.println("The addition method result is " + addition(20,20));

        // Local Variables
        var age = 12;
        System.out.println(age);

        var name = "Pramod";
        System.out.println(name);

        var percent = 98.7;
        System.out.println(percent);


    }
}
