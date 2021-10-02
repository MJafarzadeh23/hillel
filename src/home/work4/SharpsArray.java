import java.util.Scanner;

public class SharpsArray {
    public static void main(String[] args) {

        // print a box of '#' using LOOPS and array sizes, set by user
        Scanner dim = new Scanner(System.in);
        System.out.println("Please, enter height:");

        if (dim.hasNextInt()) {     //validation for integers
            int height = dim.nextInt();
            if (height <= 0) {      //validation for positive number
                System.out.println("Input is not valid!");
            } else {
                System.out.println("Please, enter width:");

                if (dim.hasNextInt()) {
                    int width = dim.nextInt();
                    if (width <= 0) {
                        System.out.println("Input is not valid!");
                    } else {
                        int[][] sharpsArray = new int[height][width];

                        for (int i = 0; i < sharpsArray.length; i++) {  // 'i < height' can be used also
                            int counter = 0;
                            for (int j = 0; j < width; j++) {
                                System.out.print("#");
                                counter++;
                            }
                            System.out.println();
                        }
                    }
                } else {
                    System.out.println("Sorry, input is not valid!");
                }
            }
        } else {
            System.out.println("Sorry, input is not valid!");
        }
    }
}