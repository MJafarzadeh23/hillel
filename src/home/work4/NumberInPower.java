package home.work4;

import java.util.Scanner;

public class NumberInPower {
    public static void main(String[] args) {

        // Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a positive integer number:");

        if (input.hasNextInt()) {     //validation for integers
            int number = input.nextInt();
            if (number < 0) {      //validation for positive number
                System.out.println("Input is not valid!");
            } else {
                System.out.println("Please, enter positive integer of power number:");

                if (input.hasNextInt()) {
                    int power = input.nextInt();

                    if (power < 0) {
                        System.out.println("Input is not valid!");
                    } else if (power == 0) {
                        System.out.println(number + " to the power of 0 is equal to 1");
                    } else {
                        double result = 1;
                        for (int i = 1; i <= power; i++) {
                            result = result * number;
                        }
                        System.out.println(number + " to the power of " + power + " is equal to " + String.format("%.0f", result));
                    }
                } else {
                    System.out.println("Sorry, input is not valid!");
                }
            }
        } else {
            System.out.println("Sorry, input is not valid!");
        }
    }
}
