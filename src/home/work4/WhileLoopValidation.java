package home.work4;

import java.util.Scanner;

public class WhileLoopValidation {
    public static void main(String[] args) {

        // Write a program that takes the numbers input by user
        // till the user wants and as the result it will output the count of positive, negative and zeros entered. Use do while loop.
        Scanner input = new Scanner(System.in)/*.useDelimiter("[,\\s+]")*/;
        int number = -1;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int count = 0;
        System.out.println("Enter integers using whitespace as delimiter. Type 'Exit' and press Enter to finish input");

            do {
                number = input.nextInt();
                count++;
                if (number > 0) {
                    positive++;
                } else if (number < 0) {
                    negative++;
                } else if (number == 0) {
                    zero++;
                } else {
                    System.out.println("Input in not valid");
                    break;
                }
            } while (input.hasNextInt());
            input.close();
            System.out.println("You entered " + positive + " positive, " + negative + " negative and " + zero + " zero values.");
    }
}

