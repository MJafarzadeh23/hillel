package home.work3;

import java.util.Scanner;

public class SwitchWeekday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day/number of weekday (note: use integers)");

        if (!input.hasNextInt()) {
            System.out.println("Input is not valid!");
        } else {
            int weekday = input.nextInt();

            switch (weekday) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("Sorry, input is not valid!");
            }
        }
    }
}
