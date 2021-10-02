package home.work5;

import java.util.Scanner;

public class InputAsk {
    public static void main(String[] args) {

    // call the method to ask name and print personalized greeting
        userName();

    // call the method to ask input of array with INT values
        int[] userArray = intArrayInput();
    }

    // method to ask name and print personalized greeting
    public static String userName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, type your name:");
        String name = input.nextLine();
        System.out.println("Welcome, " + name + ", in the world of JAVA!");
        return name;
    }

    // method to ask input of INT values array
    public static int[] intArrayInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        int[] array = new int[0];
        if (input.hasNextInt()) {     //validation for integers
            int elementsNumber = input.nextInt();
            if (elementsNumber <= 0) {      //validation for positive number
                System.out.println("Input is not valid!");
            } else {
                array = new int[elementsNumber];
                System.out.println("Enter " + elementsNumber + " integer numbers through Enter:");

                for (int i = 0; i < array.length; i++) {
                    if (!input.hasNextInt()) {
                        System.out.println("Input is not valid!");
                        break;
                    } else {
                        array[i] = input.nextInt();
                    }
                }
            }
        } else {
            System.out.println("Sorry, input is not valid!");
        }
        return array;
    }

    // method to ask for input of POSITIVE INTEGER NUMBER
    public static int intInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a positive integer number:");

        int number = 0;
        if (input.hasNextInt()) {
            number = input.nextInt();
            if (number < 0) {
                System.out.println("Input is not valid!");
            }
        } else {
            System.out.println("Input is not valid!");
        }
        return number;
    }

    // method to ask user for a number > 10 and < 1000
    // validate that input is within range, prompt the user until the valid number is entered
    public static int numberInRange() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a positive integer number in the range from 10 to 1000: ");

        int userInput;
        do {
            userInput = input.nextInt();

            if (userInput > 1000) {
                System.out.println("Too high, try again:");
            } else if (userInput < 10) {
                System.out.println("Too low, try again:");
            } else {
                break;
            }
        } while ((userInput<10) || (userInput>1000));
        return userInput;
    }
}
