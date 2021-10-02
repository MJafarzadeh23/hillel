package home.work7;

import java.util.Scanner;

public class DogAge {

    private static double result;

    public static void printDogsAge(int humanAge) {
        result = humanAge /(double) 7;      // The long-believed "1 dog year = 7 human years" theory is not supported by science
        System.out.println(humanAge + " human years is near " + String.format("%.1f", result) + " dog's years");
    }

    public static int inputHumanAge() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your age (positive integer number):");

        int inputHumanAge = 0;
        if (input.hasNextInt()) {
            inputHumanAge = input.nextInt();
            if (inputHumanAge < 0) {
                System.out.println("Input is not valid!");
            }
        } else {
            System.out.println("Input is not valid!");
        }
        return inputHumanAge;
    }
}
