package home.work4;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        // Write a program that prompts the user to input an integer and then
        // outputs the number with the digits reversed and spaces between the digits
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter number:");
        String number = input.nextLine();

        // convert String input to Char array
        char[] strToArray = number.toCharArray();

        // swap left and right values of Char array moving from edge to center
        for (int left = 0, right = strToArray.length - 1; left < right; left++, right--) {
            char loopArray = strToArray[left];
            strToArray[left]  = strToArray[right];
            strToArray[right] = loopArray;
        }
        // reverse array output
        for (int i = 0; i < strToArray.length; i++) {
            System.out.print(strToArray[i] + " ");
        }
    }
}
