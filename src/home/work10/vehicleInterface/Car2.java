package home.work10.vehicleInterface;

public class Car2 implements VehicleInterface2 {

    public String carType;
    public String transmission;
    public int carSpeed;

    public Car2() {
    }

    public Car2(String model, int vehicleSpeed, String transmission) {
        this.carType = model;
        this.carSpeed = vehicleSpeed;
        this.transmission = transmission;
    }

    public void speedUp(int value) {
        if (carSpeed < value) {
            System.out.println("Car can be speeded up");
        } else {
            applyBrake(value);
        }
    }

    public void applyBrake(int value) {
        if (carSpeed >= value) {
            System.out.println("Car is moving too fast. Apply brake!");
        } else {
            System.out.println("Car is moving with normal speed");
        }
    }

    @Override
    public void move() {
        System.out.println(carType + " car with " + transmission + " transmission is moving with a speed of " + carSpeed + " km/h");
    }
}
