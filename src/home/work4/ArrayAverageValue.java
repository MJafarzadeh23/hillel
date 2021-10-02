package home.work4;

        import java.util.Arrays;

public class ArrayAverageValue {
    public static void main(String[] args) {

        // Write a program to calculate average value of an array elements

        // array of integers
        int[] array = {1, 5, 36, 5, 1};

        System.out.println(Arrays.toString(array));
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double averageValue = sum / array.length;
        System.out.println("The average value of an array elements is " + String.format("%.2f", averageValue));
    }
}