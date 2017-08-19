import java.util.Scanner;

public class CollatzSequence {

    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();
        System.out.print("Collatz: ");

        // Start coding

        String result = String.valueOf(number);

        while (number > 1){
            if ((number & 1) == 0){number /= 2;}
            else {number = number * 3 + 1;}
            result += (" " + String.valueOf(number));
        }

        System.out.print(result);
        // End coding
    }
}
