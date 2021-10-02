package home.work4;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        // Write a program that generates a random number and asks the user to guess what the number is.
        // If the user's guess is higher than the random number, the program should display "Too high, try again."
        // If the user's guess is lower than the random number, the program should display "Too low, try again."
        // The program should use a loop that repeats until the user correctly guesses the random number.
        Scanner input = new Scanner(System.in);

        // generate a random number
        int correctAnswer = ((int) (Math.random() * 10) + 1);
        System.out.println("Guess an integer number between 1 and 10: ");

        int userInput;
        do {
            userInput = input.nextInt();

            if (userInput > correctAnswer) {
                System.out.println("Too high, try again:");
            } else if (userInput < correctAnswer) {
                System.out.println("Too low, try again:");
            } else {
                System.out.println("Yes, you guessed the number!");
                break;
            }
        } while (userInput != correctAnswer);
    }
}