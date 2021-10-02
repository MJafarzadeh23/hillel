package home.work2;

public class Distance {
    public static void main(String[] args) {
        // calculate a walking speed
        double distance = 2500;    // distance in meters
        double hours = 5;
        double minutes = 56;
        double seconds = 23;
        double speed_meters_second, speed_km_hour, time_in_seconds, time_in_hours;

        time_in_seconds = hours*3600 + minutes*60 + seconds;
        time_in_hours = time_in_seconds / 3600;
        speed_meters_second = distance / time_in_seconds;
        speed_km_hour = (distance / 1000) / time_in_hours;

        System.out.println("Your speed in meters/second is " + speed_meters_second);
        System.out.println("Your speed in km/h is " + speed_km_hour);
    }
}