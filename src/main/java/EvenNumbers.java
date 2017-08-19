import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int number = sc.nextInt(); sc.close();
        System.out.print("Even numbers are: ");

        // Start coding

        while (number >= 0) {
            if ((number & 1) == 0) {
                System.out.print(number + " ");
            }
            number--;
        }

        // End coding
    }
}
