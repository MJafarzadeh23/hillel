package home.work3;

import java.util.Scanner;

public class MonthSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of month:");

        if (!input.hasNextInt()) {      // validation for integer input
            System.out.println("Input is not valid!");
        } else {
            int month = input.nextInt();

                switch (month) {
                    case 1:
                    case 2:
                    case 12:
                        System.out.println("It's Jingle Bells season!");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It's Here Comes the Sun season!");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("It's Cool for the Summer season!");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("It's Wake Me Up When September Ends season!");
                        break;
                    default:
                        System.out.println("Sorry, input is not valid!");

                }
        }
    }
}
