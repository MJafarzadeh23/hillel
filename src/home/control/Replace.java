package home.control;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        //Replace (Написать программу, которая заменяет в исходной строке все буквы а на @. Буквы о на ноль.
        // Выводит новую строку на экран. Добавить обработку длины строки, максимальная длина 30 символов.
        // Строка может состоять из нескольких слов и любых символов)

        Scanner input = new Scanner(System.in);
        System.out.println("Type any sting:");

        String string = input.nextLine();
        if (string.length() <= 30) {
            System.out.println("Original String: " + string);

            // заменяет в исходной строке все буквы а на @
            String str1 = string.replace('a', '@');
            String str2 = str1.replace('o', '0');
            System.out.println("Replaced a with @ -> " + str2);
        } else {
            System.out.println("Sorry, your string is too long");
        }
    }
}
