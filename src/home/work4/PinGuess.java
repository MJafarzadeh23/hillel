import java.util.Scanner;

public class PinGuess {
    public static void main(String[] args) {

        //validate the input from user who has only three tries to guess the correct pin of the account
        Scanner input = new Scanner(System.in);

        // set String type for pin in case user can input different symbols
        /*String validPin = "2633";
        String pin;

        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Please, enter pin:");
            pin = input.nextLine();

            if (pin.equals(validPin)) {
                System.out.println("Correct, welcome back!");
                break;
            } else if (counter == 2) {
                System.out.println("Sorry, but you have been locked out.");
                return;
            } else {
                System.out.println("Incorrect, try again!");
            }
        }*/

        // as usual for input where is no other choice as to enter integer numbers
        int validPin = 2633;
        int pin;

        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Please, enter pin:");
            pin = input.nextInt();

            if (pin == validPin) {
                System.out.println("Correct, welcome back!");
                break;
            } else if (counter == 2) {
                System.out.println("Sorry, but you have been locked out.");
                return;
            } else {
                System.out.println("Incorrect, try again!");
            }
        }
    }
}
