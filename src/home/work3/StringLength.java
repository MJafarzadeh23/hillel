package home.work3;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        int expectedTextFieldLength = 6;
        String emptyField = "";

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a word:");
        String word = input.nextLine();

        int wordLength = word.length();

        if (wordLength > expectedTextFieldLength || word.equals(emptyField)) {
            System.out.println("Error!");
        } else {
            System.out.println("Thank you!");
        }
        /*if (input.hasNextInt() || input.hasNextDouble()) {
            System.out.println("You entered a number");
            String number = input.nextLine();

            int numberLength = number.length();
            System.out.println("...and your number consists of " + numberLength + " symbols.");

        } else {
            String word = input.nextLine();

            int wordLength = word.length();
            System.out.println("Your word or phrase consists of " + wordLength + " letters.");
        }*/
    }
}
