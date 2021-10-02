package home.control;

import home.work5.PrintPatterns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Напишите метод который принимает массив целых чисел и возвращает массив со всеми четными числами из исходного массива

        int[] evenNumArray = evenNumbers();
        System.out.println("Array of even numbers is as follows:");
        for (int j = 0; j < evenNumArray.length; j++) {
            System.out.print(evenNumArray[j] + " ");
        }

        fizzBuzz();

    }

    public static int[]  evenNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        int[] array = new int[0];
        if (input.hasNextInt()) {     //validation for integers
            int elementsNumber = input.nextInt();
            if (elementsNumber <= 0) {      //validation for positive number
                System.out.println("Input is not valid!");
            } else {
                array = new int[elementsNumber];
                System.out.println("Enter " + elementsNumber + " integer numbers through Enter:");

                for (int i = 0; i < array.length; i++) {
                    if (!input.hasNextInt()) {
                        System.out.println("Input is not valid!");
                        break;
                    } else {
                        array[i] = input.nextInt();
                    }
                }
            }
        } else {
            System.out.println("Sorry, input is not valid!");
        }

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                 counter++;
            }
        }
        int[] evenArray = new int[counter];
        int i = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenArray[i] = element;
                i++;
            }
        }
        return evenArray;
    }

    //FizzBuzz (Напишите метод, который принимает целое число. Если это число делится на 5 – выводим в консоль Fizz, если делится на 7 – выводим в консоль Buzz, если делится на 5 и на 7 – выводим FizzBuzz, если не делится – выводим число).
    public static void fizzBuzz() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter an integer number");
        int number = 0;
        if (input.hasNextInt()) {
            number = input.nextInt();

            if ((number % 5 == 0) && (number % 7 == 0)) {
                System.out.println("FizzBuzz");
            } else if (number % 7 == 0) {
                System.out.println("Buzz");
            } else if (number % 5 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(number);
            }
            if (number < 0) {
                System.out.println("Input is not valid!");
            }
        } else {
            System.out.println("Input is not valid!");
        }
    }

    /*public static boolean isArmstrong(int number) {
        //371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
        //Если у вас число четырехзначное:
        //8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8 = 4096 + 16 + 0 + 4096 = 8208)

       *//* char[] numberArray = String.valueOf(number);
        int len = numberArray.length;
        double result = 1;
        for (int i = 0; i < numberArray.length; i++) {
            result = 1;
            for (int j = 1; j <= len; j++) {
                result = result * numberArray[i];
            }
        }
        System.out.println(result);*//*

*//*
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }*//*
    }*/
    }
