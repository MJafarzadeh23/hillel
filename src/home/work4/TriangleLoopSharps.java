package home.work4;

import java.util.Scanner;

public class TriangleLoopSharps {
    public static void main(String[] args) {
        // Write a program that takes a max number of rows from user and prints out # sign with the following pattern:
        // first row ## and every following row increments qty by 1, so the second will be ###,
        // third #### until we reach the qty of rows that was input by user.
        // Use loops, make validations for user input (negative, empty)
        String emptyInput = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a positive integer number:");
        String rowsNumber = input.nextLine();

            // validation for empty input and letters input
        if (rowsNumber.equals(emptyInput) || rowsNumber.toLowerCase().matches(".*[a-z].*")) {
            System.out.println("Error!");

            // validation for double/float input
        } else if (rowsNumber.toLowerCase().contains(".")) {
            System.out.println("Input is not valid!");

        } else {
            int numberOfRows = Integer.parseInt(rowsNumber); // convert input String to integer

                // validation for negative and 0 input
            if (numberOfRows <= 0) {
                System.out.println("Input is not valid!!");
            } else if (numberOfRows > 0) {
                for (int i = 2; i <= (numberOfRows + 1); i++) { // it starts with 2, adding +1 on every cycle and number of cycles will be 1 more than entered input number
                    int counter = 0;
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                        counter++;
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Input is not valid!!!");
            }
        }
    }
}
