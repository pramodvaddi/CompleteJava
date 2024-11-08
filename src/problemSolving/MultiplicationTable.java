package problemSolving;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Multiplication Tables from 1 to 10.
        for(int i = 1; i <= 10; i++){
            System.out.println("Multiplication table of " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i+ " * "+ j + " = " + i*j);
            }


        }
    }
}
