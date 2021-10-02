package home.work3;

import java.util.Scanner;

public class GoodDayMorningEvening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your time in 24h format (note: use integers)");

        if (!sc.hasNextInt()) {
            System.out.println("Input is not valid!");
        } else {
            int time = sc.nextInt();

            if (time < 10 && time >= 0) {
                System.out.println("Good Morning!");
            } else if (time >= 10 && time < 18) {
                System.out.println("Good Day!");
            } else if (time >= 18 && time <= 24) {
                System.out.println("Good Evening!");
            } else {
                System.out.println("Input is not valid");
            }
        }
    }
}