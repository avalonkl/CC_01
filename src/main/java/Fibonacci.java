import java.util.Scanner;
import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.print("Enter the length of the Fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); sc.close();
        System.out.print("Fibonacci series are: ");

        // Start coding

        BigInteger fibonacci0 = BigInteger.ZERO;
        BigInteger fibonacci1 = BigInteger.ONE;
        for (int i = 1; i <= number; i++){
            System.out.println(fibonacci0);
            fibonacci0 = fibonacci0.add(fibonacci1);
            fibonacci1 = fibonacci0.subtract(fibonacci1);
        }


        // End coding
    }
}
