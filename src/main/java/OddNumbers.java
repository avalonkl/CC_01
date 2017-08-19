import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int number = input.nextInt(); input.close();
        System.out.print("Odd numbers are: ");

        // Start coding

        while (number != 0) {
            if ((number & 1) == 1) {
                System.out.print(number + " ");
            }
            number--;
        }

        // End coding
    }
}
