package coreJava.advanced.exceptionHandling;

import java.io.FileNotFoundException;

public class ExceptionHandling {

    /*
       Exception: It is an event that occurs during the execution of a program that disrupts the normal flow of a program.

       Different types of exceptions
            1. Checked Exceptions: Compile Time Exception.
            2. Unchecked Exceptions: Runtime Exception.

       Try, Catch, Finally blocks are used to handle exceptions.

       Stack trace: Exception name, line number, methods info.
                    Ex: Exception in thread "main" java.lang.ArithmeticException: / by zero
	                    at coreJava.advanced.exceptionHandling.ExceptionHandling.main(ExceptionHandling.java:26)


       try {
            We will enclose the exception (chances) here.
       }
       catch {
            If exception occurs, catch will take care of it as per our instructions.
            throw ae; This will forward the exception to Java, eventually, Java will stop the execution.
                      Code written after throw will not execute as it is unreachable.
       }
       finally {
            This block will execute in all cases.
       }

       try block is mandatory block
       catch is mandatory if there is not finally block
       finally is optional if there is catch block. If there is not catch block, then finally must be there.

       Exception Hierarchy
             Runtime Exceptions (Unchecked)
                  1. IndexOutOfBoundsException
                  2. NullPointerException
                  3. ArithmeticException
                IO Exception
                     FileNotFoundException
                SQLException
             Compile Time (Checked) exception are the exceptions which are not Runtime exceptions.

       Super class of all the exceptions in Java is Exception.
       Super class of exception is throwable.

       ae.toString() : Prints both exception and message
       ae.getMessage(): Prints only message.
       ae.getStackTrace(): Will give you complete details where the exception is caused.
                           This will return an Array.
                           To  print an Array, use (Arrays.toString(ae.getStackTrace()));
       ae.printStackTrace(): Prints all the stack trace, we don't need to use SOUT here.
    */

    public static void main(String[] args) throws FileNotFoundException, ArithmeticException {
        System.out.println("Program starts here ");
        int x = 8;
        int y = 2;
        int result = 0;

        try {
            result = x/y;
        } catch(ArithmeticException ae){
            System.out.println(ae.toString());
            throw ae;
        } finally {
            System.out.println("Finally block");
        }

        System.out.println("Output is " + result);
        System.out.println("End of execution");

    }
}
