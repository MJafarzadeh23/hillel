package home.work3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year:");

        if (!input.hasNextInt()) {      // validation for integer input
            System.out.println("Input is not valid!");
        } else {
            int year = input.nextInt();

            if (year < 0) {     // validation for positive integer input
                System.out.println("Input is not valid!");
            } else {

                // if a year cant be devided for 4 without reminder, so it's not a leap year, otherwise next checks
                if (year % 4 != 0) {
                    System.out.println("Year " + year + " is not a leap year");
                } else {

                    // if a year can be divided for 100 and 400 without reminder, so it's a leap year
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println("Year " + year + " is a leap year");
                        } else {
                            System.out.println("Year " + year + " is not a leap year");
                        }
                    // if a year can not be devided for 100 without reminder, so it's a leap year
                    } else {
                        System.out.println("Year " + year + " is a leap year");
                    }
                }
            }
        }
    }
}
