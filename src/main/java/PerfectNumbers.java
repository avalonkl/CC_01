import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();
        System.out.print("Perfect numbers are: ");

        // Start coding

        while (number > 1){
            int sum = 0;
            for (int i = 1;i < number; i++){
                if (number % i == 0){
                    sum += i;
                }
            }
            if (number == sum){
                System.out.print(number + " ");
            }
            number--;
        }

        // End coding
    }
}
