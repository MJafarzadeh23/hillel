package home.work2;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter the first side in cm");
        double a = scan.nextInt();
        System.out.println("Now, enter the second side in cm");
        double b = scan.nextInt();
        System.out.println("Please, enter the included angle in degrees");
        double angle = scan.nextInt() * Math.PI / 180;
        double area = 0.5 * a * b * Math.sin(angle);

        System.out.println("The area of a triangle is equal to " + area + " sq cm");
    }
}
