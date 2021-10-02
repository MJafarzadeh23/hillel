package home.work3;

public class IfTernaryGoodDayEvening {
    public static void main(String[] args) {
        int time = 18;

        // if operator
        if (time < 18) {
            System.out.println("Good Day!");
        }
        if (time >= 18) {
            System.out.println("Good Evening!");
        }

        // if else operator
        if (time < 18) {
            System.out.println("Good Day!!");
        } else {
            System.out.println("Good Evening!!");
        }

        // ternary operator
        String ternaryTime = (time < 18) ? "Good Day!!!" : "Good Evening!!!";
        System.out.println(ternaryTime);
    }
}
