package home.work2;

public class MinutesToYearsDays {

    public static void main(String[] args) {
        // Minutes to Years and Days converter
        int minutes = 3456789;
        int days;
        int years;
        int days_left;
        // number of days
        days = minutes / 1440;    // 1400 - minutes per one day
        years = days / 365;       // 365 - days per year
        days_left = days - years * 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days_left + " days");
    }
}
