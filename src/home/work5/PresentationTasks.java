package home.work5;

public class PresentationTasks {
    public static void main(String[] args) {

    // call the method which returns True if a given number is even and False if it is odd
        System.out.println(isEven(6));

    // call the method which returns the sum of max and min in the given array
        /*int sumMinMax = sumArrayElements(new int[] {2, 3, 6, 0, 6});*/
        int[] userArray = InputAsk.intArrayInput();
        int sumMinMax = sumMinMaxElements(userArray);
        System.out.println("The sum of min and max values of array set by user is " + sumMinMax);

    // call the method which returns an array of ASCII codes for given array of chars
        char[] arr = {'j', 'a', 'v', 'a', '!'};
        int[] asciiArray = charsArray(arr);
        System.out.print("Given chars array: ");
        System.out.println(arr);
        System.out.println("The array of ASCII codes for given array of chars is as follows:");

        for (int j = 0; j < asciiArray.length; j++) {
            System.out.print(asciiArray[j] + " ");
        }
    }

    // Method which returns True if a given number is even and False if it is odd
    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        } else  {
            return  false;
        }
        /*return (number % 2 == 0) ? true : false;

        return number % 2 == 0;*/
    }
//----------------------------------------------------------------------------------------------------------------------
    // Method which returns the sum of max and min in the given array
    public static int sumMinMaxElements(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int sumArray = min + max;
        return sumArray;
    }
//----------------------------------------------------------------------------------------------------------------------
    // Method which returns an array of ASCII codes for given array of chars
    public static int[] charsArray(char[] array) {
        int charsToAscii[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            charsToAscii[i] = (int) array[i];
        }
        return charsToAscii;
    }
}
