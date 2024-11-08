package coreJava.intermediate;

public class ForLoop {
    public static void main(String[] args) {
        /*
         For loop will have 3 compartments,
            1. Initialise: Mandatory
            2. Condition,
            3. Increment

         */

        // If you initialise variable inside for loop compartment, it will belong to for loop only.
        // If you initialise variable outside for loop, you can access it outside the loop as well.

        int i;
        for(i= 0; i<=10; i++){
            System.out.println("For loop "+ i);
        }

        // Incrementing by 2
        int x;
        for(x = 0; x <= 10; x+=2){
            System.out.println("Another loop "+ x);
        }

        // Removing compartments
        int y;
        for(y = 0; ;){
            if(y<=10){
                System.out.println("Yes, another loop "+y);
                y++;
            }

        }


    }
}
