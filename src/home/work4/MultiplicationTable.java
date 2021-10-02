import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Write a program that prompts the user to input a positive integer.
        // It should then print the multiplication table of that number.
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a positive integer number:");

        if (!input.hasNextInt()) {      // validation for integer input
            System.out.println("Input is not valid!");
        } else {
            int number = input.nextInt();

            if (number < 0) {     // validation for positive integer input
                System.out.println("Input is not valid!");
            } else {
                for (int i = 0; i <= 10; ++i) {
                    System.out.printf("%d * %d = %d \n", number, i, number * i);
                }
            }
        }
    }
}
