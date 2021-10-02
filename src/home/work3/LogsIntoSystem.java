package home.work3;

import java.util.Scanner;

public class LogsIntoSystem {
    public static void main(String[] args) {
        // create user with known authorization data
        String userName = "Maria";
        String userPassword = "Maria123";
        String emptyField = "";
        int expectedPasswordLength = 6;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();

        if (name.equals(emptyField)) {
            System.out.println("Error!");
        } else {
            System.out.println("Enter your password:");
            String password = input.nextLine();
            int passwordLength = password.length();

            if (name.equals(userName) && password.equals(userPassword)) {
                System.out.println("Welcome, authorized User!");
            } else if (!name.equals(userName) && passwordLength >= expectedPasswordLength) { // password can consist of any symbols, but its length should not be more than expected
                System.out.println("Welcome, " + name);
            } else {
                System.out.println("Error!");
            }
        }
    }
}
