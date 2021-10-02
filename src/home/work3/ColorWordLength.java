package home.work3;

import java.util.Scanner;

public class ColorWordLength {
    public static void main(String[] args) {

        System.out.println("Red, blue, green, yellow, orange, black, white, pink");
        Scanner input = new Scanner(System.in);
        System.out.println("Type some color from the above mentioned ones:");
        String color = input.nextLine();

        switch (color.toLowerCase()) {  // changed case value to LowerCase for ignoring case of input
            case "red":
                System.out.println("Word consists of 3 letters");
                break;
            case "blue":
            case "pink":
                System.out.println("Word consists of 4 letters");
                break;
            case "green":
            case "black":
            case "white":
                System.out.println("Word consists of 5 letters");
                break;
            case "yellow":
            case "orange":
                System.out.println("Word consists of 6 letters");
                break;
            default:
                System.out.println("Input is not valid");
        }
    }
}
