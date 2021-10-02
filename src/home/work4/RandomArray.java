package home.work4;

import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {

        //create an array and fill it in by randomly generated numbers.
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter qty of elements in the array:");

        if (input.hasNextInt()) {     //validation for integers
            int qty = input.nextInt();
            if (qty <= 0) {      //validation for positive number
                System.out.println("Input is not valid!");
            } else {
                int[] array = new int[qty];

                for (int i = 0; i < array.length; i++) {
                    array[i] = (int) (Math.random() * 100);
                }
                System.out.println("The array of " + qty + " random elements from 0 to 99 is as follows:");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
            }
        } else {
            System.out.println("Input is not valid!");
        }
    }
}
