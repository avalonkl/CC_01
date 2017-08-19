import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();
        System.out.print("Factorial: ");

        // Start coding

        int factorial = number;
        for (int i = number-1; i > 0; i--){
            factorial *= i;
        }
        System.out.print(factorial);

        // End coding
    }
}
