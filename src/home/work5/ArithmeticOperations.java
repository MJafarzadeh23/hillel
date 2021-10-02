package home.work5;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

    // call the method to create an array of a given size, filled in with random numbers from 1 to 20
        int[] userArray = randomArray(InputAsk.intInput());
        System.out.println("Array of a given size, filled in with random numbers from 1 to 20 is as follows:");
        for (int j = 0; j < userArray.length; j++) {
            System.out.print(userArray[j] + " ");
        }

    // call the method that takes two numbers and returns the value of one number raised to the power of another
        System.out.println('\n' + "-------------------------------------------------");
        System.out.println("Number to the power of Method");
        int num = InputAsk.intInput();
        int pow = InputAsk.intInput();
        System.out.println(num + " in power of " + pow + " = " + (numberInPowerOf(num, pow)));

    // call the method to return the sum of values of the given array
        int[] userArr = InputAsk.intArrayInput();
        int sumArrayValues = sumIntArray(userArr);
        System.out.println("The sum of array values is " + sumArrayValues);
    }

    //  Method that returns an array of a given size, filled in with random numbers from 1 to 20.
    public static int[] randomArray(int arraySize) {
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20) + 1;
        }
        return array;
    }

    // Method that takes two numbers and returns the value of one number raised to the power of another
    public static int numberInPowerOf(int numberToPower, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * numberToPower;
        }
        return result;
    }

    // Method to return the sum of values of the given array
    public static int sumIntArray(int[] array) {
        int sumArray = 0;
        for (int element : array) {
            sumArray = sumArray + element;
        }
        return sumArray;
    }

    // Method to calculate average value of array elements
    public static double averageValueArray(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double averageValue = sum / array.length;
        return averageValue;
    }

    // Method that takes two numbers and returns the value of one number raised to the power of 2
    public static int numberInPowerOf2(int numberToPower) {
        int power = 2;
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * numberToPower;
        }
        return result;
    }

}
