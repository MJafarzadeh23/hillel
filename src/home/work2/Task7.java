package home.work2;

public class Task7 {

    /* For each task print result into console
       1. Convert 5 hours into minutes.
       2. Calculate a square of the rectangular triangle, 2 sides' values are given.
       3. Given 3 numbers, calculate the average for their squared values.
       4. Given t in Fahrenheit, convert it to Celsius. tC = (tF - 32) x 5/9.
       5. Given t in Celsius, convert it to Kelvin. Kelvin = tC + 273.16.
     */

    public static void main(String[] args) {

        // task 1
        int hours = 5;
        int minutes = hours * 60;
        System.out.println(hours + " hours is " + minutes + " minutes");

        // task 2 - Calculate a square of the rectangular triangle
        int a = 3;
        int b = 5;
        double triangle_area = 0.5 * a * b;
        System.out.println("The area of a triangle is " + triangle_area + " RU");

        // task 3 - Given 3 numbers, calculate the average for their squared values
        int numb1 = 4;
        int numb2 = 6;
        int numb3 = 7;
        double average;
        average = (Math.pow(numb1, 2) + Math.pow(numb2, 2) + Math.pow(numb3, 2)) / 3;
        System.out.println("The average for 3 given squared values is " + average);

        // task 4 - Given t in Fahrenheit, convert it to Celsius. tC = (tF - 32) x 5/9
        double fahrenheit = 120;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");

        // task 4 - Given t in Celsius, convert it to Kelvin. Kelvin = tC + 273.16
        double tC = 25;
        double Kelvin = tC + 273.16;
        System.out.println(tC + " Celsius is " + Kelvin + " Kelvin");
    }
}
