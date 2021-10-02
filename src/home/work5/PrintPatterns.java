package home.work5;

import java.util.Scanner;

public class PrintPatterns {
    public static void main(String[] args) {

    // call the method that takes an integer and then returns the number with its digits reversed
        System.out.println("Reverse integer number Method. Need to set number with a few digits.");
        String intNum = new String(String.valueOf(InputAsk.intInput()));
        System.out.println("Reverse number:");
        System.out.println(reverseIntArray(intNum));

    // call method and print MULTIPLICATION TABLE
        System.out.println("-----------------------------------------------");
        multiplicationTablePrint(5);

    // call the method that prints out 'stairs' pattern according to given number of rows (as in task 6 from HW4)
        System.out.println("-----------------------------------------------");
        stairsPatternPrint(8);

    // call the method that prints out rectangle of * sign according to given height and width
        System.out.println("-----------------------------------------------");
        rectanglePatternPrint(2,5);

    // call method to ask user to input an array with INT values and then call method to print given array with comma
        System.out.println("-----------------------------------------------");
        System.out.println("");
        int[] userArray = InputAsk.intArrayInput();
        printArrayWithComma(userArray);
    }

    // Method to print array of integers with commas. No comma has to be in the end of the vizualization.
    public static void printArrayWithComma(int[] array) {
        System.out.println("Given array of INT elements: ");
        for (int i = 0; i < (array.length - 1); i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1]);
    }

    // Method that prints out multiplication table of a given integer
    public static void multiplicationTablePrint(int number) {
        for (int i = 0; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }
    }

    // Method that takes an integer and then returns the number with its digits reversed.
    public static char[] reverseIntArray(String dimNumber) {
        // convert String input to Char array
        char[] strToArray = dimNumber.toCharArray();

        // swap left and right values of Char array moving from edge to center
        for (int left = 0, right = strToArray.length - 1; left < right; left++, right--) {
            char loopArray = strToArray[left];
            strToArray[left]  = strToArray[right];
            strToArray[right] = loopArray;
        }
        return strToArray;
    }

    // Method that prints out 'stairs' pattern according to given number of rows (as in task 6 from HW4).
    public static void stairsPatternPrint(int rowsNumber) {
        for (int i = 2; i <= (rowsNumber + 1); i++) {
            int counter = 0;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                counter++;
            }
            System.out.println();
        }
    }

    // Method that prints out rectangle of * sign according to given height and width.
    public static void rectanglePatternPrint(int height, int width) {
        int[][] sharpsArray = new int[height][width];

        for (int i = 0; i < sharpsArray.length; i++) {  // 'i < height' can be used also
            int counter = 0;
            for (int j = 0; j < width; j++) {
                System.out.print("*");
                counter++;
            }
            System.out.println();
        }
    }
}
