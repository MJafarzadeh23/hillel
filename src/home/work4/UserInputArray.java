package home.work4;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {

        //Ask user to input qty of elements in the array. Create an empty array of the given qty of elements.
        // Write a program that fills in your empty array with numbers from 1 (at 0 index of your array) to the last array element.
        // Print the resulting array into console.

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter qty of elements in the array:");

        if (input.hasNextInt()) {     //validation for integers
            int qty = input.nextInt();
            if (qty <= 0) {      //validation for positive number
                System.out.println("Input is not valid!");
            } else {
                int[] array = new int[qty];

                for (int i = 0; i < array.length; i++) {
                    array[i] = i + 1;
                }

                System.out.println("The array of " + qty + " elements is as follows:");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
            }
        } else {
            System.out.println("Input is not valid!");
        }
    }
}
