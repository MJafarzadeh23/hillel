package home.work6;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // call the reverse string method
        reverseString();

        // call the reverse order of words method
        reverseOrderStr();

        // call the method that changes all digits with *
        System.out.println("String that includes digits replaced with * by using LOOP: " + '\n' + "" + new String(replaceDigits()));

        // call the method to count how many times a substring occurs within a string
        System.out.println("----------------------------------------------------------------");
        String input = "Hello world, hello Java, hello HomeWork";
        System.out.println("Given string: " + input);
        String inputIgnoreCase = input.toLowerCase();
        String subStr = inputIgnoreCase.substring(2,4);     // to print result correctly indexes of substring here should be the same with indexes in relevant method
        System.out.println("In given string Substring '" + subStr + "' with letters in upper or lowercase occurs " + substringOccurrence(input) + " times");
    }

        // Method which takes a String and reverses it , eg “Hello world” -> “dlrow olleH”
        public static void reverseString () {
            Scanner input = new Scanner(System.in);
            System.out.println("Please, type some sentence:");
            String inputString = input.nextLine();
            String[] inputStrArray = inputString.split(" ");
            System.out.println("Reversed string:");

            String result = null;
            for (int i = inputStrArray.length - 1; i >= 0; i--) {
                String singleWord = inputStrArray[i];
                result = "";
                for (int j = singleWord.length() - 1; j >= 0; j--) {
                    result += singleWord.charAt(j);
                }
                System.out.print(result + " ");
            }
        }

        // Method which takes a String of multiple words, and reverses the order of the words (not the whole String!),
        // eg “Hello world” -> “world Hello”
        public static void reverseOrderStr () {
            Scanner input = new Scanner(System.in);
            System.out.println("\n" + "Please, type some sentence:");
            String inputString = input.nextLine();
            String[] inputStrArray = inputString.split(" ");

            System.out.println("String with reversed order of words:");
            String result = null;
            for (int i = inputStrArray.length - 1; i >= 0; i--) {
                String singleWord = inputStrArray[i];
                System.out.print(singleWord + " ");
            }
        }

        // Method which takes a String and changes all digits within this string into *
        public static char[] replaceDigits() {
            Scanner input = new Scanner(System.in);
            System.out.println("\n" + "Please, type some sentence with digits included:");
            String inputString = input.nextLine();

            System.out.println("String that includes digits replaced with * by using 'replaceAll'");
            System.out.println(inputString.replaceAll("[0-9]", "*"));

            char[] c = inputString.toCharArray();

            char[] resultArray = new char[inputString.length()];
            int i = 0;
            for (char element : c) {
                if (Character.isDigit(element)) {
                    resultArray[i] = '*';
                    i++;
                } else {
                    resultArray[i] = element;
                    i++;
                }
            }
            return resultArray;
        }

        // Method that counts how many times a substring occurs within a string, eg String example = “Hello world, hello Java, hello homework”
        // String substring = “ello” -> 3; String substring = “wo” -> 2
        public static int substringOccurrence(String input) {
            // "Hello world, heLLo Java, helLo HomeWork"
            String inputIgnoreCase = input.toLowerCase();
            String subStr = inputIgnoreCase.substring(2,4); // indexes(6,8) = "wo" in given string; indexes(2,4) = "ll"
            int counter = 0;
            int i;
            for (i = 0; i < input.length(); i++) {
                counter = inputIgnoreCase.indexOf(subStr, counter);
                counter++;

                if (counter == 0) {     // when counter will reach '0', it means that was found all occurrences of substring
                    break;              // and we should stop/break the loop. cycles of loop will match the number of substring occurrences
                }
            }
            return i;
        }
    }

