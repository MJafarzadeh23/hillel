package home.work5;

public class Overloading {
    public static void main(String[] args) {

// Write 2 methods with the same name to calculate average value of an array elements. Apply overloading principles.

        // ask for console input of INT array and call&print its average value
        int[] userIntArray = InputAsk.intArrayInput();
        double averageIntArrayValue = averageArrayValue(userIntArray);
        System.out.print("Given array of INT elements: ");
            for (int i = 0; i < userIntArray.length; i++) {
                System.out.print(userIntArray[i] + " ");
            }
        System.out.println('\n' + "The average value of an array of INT elements is " + String.format("%.2f", averageIntArrayValue));

        // double array is set by default and method calculates average value of an array
        double[] arr = {15.3, 3.1, 0, 1.25, 10};
        double averageDoubleArrayValue = averageArrayValue(arr);
        System.out.print("Given array of DOUBLE elements: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
        System.out.println('\n' + "The average value of an array of DOUBLE elements is " + String.format("%.2f", averageDoubleArrayValue));

    }

    // method to calculate average value of an array elements
    public static double averageArrayValue(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double averageValue = sum / array.length;
        return averageValue;
    }

    // method to calculate average value of an array elements
    public static double averageArrayValue(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double averageValue = sum / array.length;
        return averageValue;
    }
}
