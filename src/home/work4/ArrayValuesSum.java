package home.work4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayValuesSum {
    public static void main(String[] args) {

        // Create an array of integers. Write a Java program to sum values of the array

        // creating an array of integers
        int[][] twoDimArray =  {{2, 4, 5, 7},
                                {1, 1, 1, 5},
                                {5, 3, 5, 3},
                                {6, 6, 0, 4}};

        System.out.println(Arrays.deepToString(twoDimArray));
        int sum = 0;

        // calculation of 2-dimensional array sum
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                sum = sum + twoDimArray[i][j];
            }
        }
        System.out.println("The sum of 2-dimensional array is " + sum);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // calculation of values sum of array set by user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements in array:");

        if (input.hasNextInt()) {     //validation for integers
            int elementsNumber = input.nextInt();
            if (elementsNumber <= 0) {      //validation for positive number
                System.out.println("Input is not valid!");
            } else {
                int[] array = new int[elementsNumber];
                int sumArray = 0;
                System.out.println("Enter " + elementsNumber + " integer numbers through Enter:");

                for (int i = 0; i < array.length; i++) {
                    if (!input.hasNextInt()) {
                        System.out.println("Input is not valid!");
                        return;
                    } else {
                        array[i] = input.nextInt();
                    }
                }

                for (int element : array) {
                    sumArray = sumArray + element;
                }
                System.out.println("The sum of array set by user is " + sumArray);
            }
        } else {
            System.out.println("Sorry, input is not valid!");
        }
    }
}
