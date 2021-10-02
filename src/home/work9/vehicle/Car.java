package home.work9.vehicle;

public class Car extends Vehicle {

    public static String carType;
    public static String transmission;

    public static void setCarType(String carType) {
        Car.carType = carType;
    }

    public static void setTransmission(String transmission) {
        Car.transmission = transmission;
    }

    public void move() {
        System.out.println(carType + " car with " + transmission + " transmission is moving now");
    }
}
