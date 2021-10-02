package home.work2;

public class BodyMassIndex {

    public static void main(String[] args) {
        // Body Mass Index calculator
        int weight = 452;   // weight in pounds
        int height = 72;    // height in inches
        double bmi;

        bmi = weight/Math.pow(height, 2) * 703;   // 703 - conversion factor

        System.out.println("Body Mass Index is " + bmi);
    }
}
