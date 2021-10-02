package home.work9.vehicle;

public abstract class Vehicle {

    public int speed;
    private String model;

    public Vehicle() {
    }

    public Vehicle(String model, int vehicleSpeed) {
        this.model = model;
        this.speed = vehicleSpeed;
    }

    public void speedUp(int value) {
        if (speed > value - Math.abs((value - speed) / speed)) {
            System.out.println("Vehicle can be speeded up");
        }
    }

    public void applyBrake(int value) {
        if (speed < value) {
            System.out.println("Vehicle is moving too fast. Apply brake!");
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract void move();

    public final void stop() {
        System.out.println("Stop the vehicle!");
    }
}
