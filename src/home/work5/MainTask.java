package home.work5;

public class MainTask {
    public static void main(String[] args) {

        // call the method to ask name and print personalized greeting
        String userName = InputAsk.userName();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // ask user for a number (positive integer)
        int num = InputAsk.intInput();

        // create an array of random numbers (from 1 to 20) with the size provided by user
        int[] userArray = ArithmeticOperations.randomArray(num);

        // print out its contents
        PrintPatterns.printArrayWithComma(userArray);
        System.out.println("---------------------------------------------");

        // sum up the numbers within the array and display the result with message
        int arraySum = ArithmeticOperations.sumIntArray(userArray);
        System.out.println("The sum of array values = " + arraySum);

        // find average of numbers within array and display the result with message
        double average = ArithmeticOperations.averageValueArray(userArray);
        System.out.println("The average value of given array = " + average);
        System.out.println("---------------------------------------------");

        // print out a multiplication table for the average value that you found in previous step
        PrintPatterns.multiplicationTablePrint((int) average);
        System.out.println("---------------------------------------------");

        // ask user for a number > 10 and < 1000
        int number = InputAsk.numberInRange();
        System.out.println("Your number in range from 10 to 1000 is " + number);

        // reverse the digits of the given number, display the result
        char[] reverseArr = PrintPatterns.reverseIntArray(String.valueOf(number));
            // reverse array output
            System.out.println("The reverse number is as follows: ");
            for (int i = 0; i < reverseArr.length; i++) {
                System.out.print(reverseArr[i]);
            }

        // raise it to the power of 2, display the result
            // to calculate power of number set by char array need to change it to String and then to Int
        String reverseString = new String(reverseArr);
        int numInPower = ArithmeticOperations.numberInPowerOf2(Integer.parseInt(reverseString));
        System.out.println('\n' + reverseString + " in power of 2 = " + numInPower);

        // and finally print out the 'stairs' pattern with num of rows = sum of the numbers in the array which was found before/your user name length
        System.out.println("---------------------------------------------");
        int numOfRows = arraySum / userName.length();
        PrintPatterns.stairsPatternPrint(numOfRows);
    }
}
