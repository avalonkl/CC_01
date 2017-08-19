import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();
        System.out.print("Prime numbers are: ");

        // Start coding

        while (number > 1){
            boolean flag = true;
            for (int i = 2;i < number; i++){
                if (number % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(number + " ");
            }
            number--;
        }

        // End coding
    }
}
