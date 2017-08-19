import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt(); input.close();
        System.out.print(number + " is ");

        // Start coding

        Set<Integer> unique = new HashSet<Integer>();
        while (unique.add(number)){
            int value = 0;
            while (number > 0){
                value += Math.pow(number % 10, 2);
                number /= 10;
            }
            number = value;
        }
        System.out.print(number == 1 ? "Happy number" : "Unhappy number");

        // End coding
    }
}
