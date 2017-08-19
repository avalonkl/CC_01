import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();
        System.out.print("Armstrong numbers are: ");

        // Start coding

        while (number > 1){
            int i = number;
            int anumber = 0;
            while (i != 0){
                anumber += Math.pow(i % 10, 3);
                i = i / 10;
            }
            if (number == anumber){
                System.out.print(number + " ");
            }
            number--;
        }

        // End coding
    }
}
