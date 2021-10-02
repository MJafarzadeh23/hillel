package home.work9.vehicle;

public class Helicopter extends Vehicle {

    public int amountOfPassengers;
    public int maxHeight;
    public int tankSize;

    public Helicopter() {
    }

    public Helicopter(String model, int vehicleSpeed, int amountOfPassengers, int maxHeight, int tankSize) {
        super(model, vehicleSpeed);
        this.amountOfPassengers = amountOfPassengers;
        this.maxHeight = maxHeight;
        this.tankSize = tankSize;
    }

    public void move() {
        System.out.println("Helicopter is flying");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
