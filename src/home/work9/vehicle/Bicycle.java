package home.work9.vehicle;

public abstract class Bicycle extends Vehicle {

    public final int id = 2020;
    protected int gear;

    public Bicycle() {
    }

    public Bicycle(String model, int bicycleSpeed, int gear, int id) {
        super(model, bicycleSpeed);
        this.gear = gear;
    }

    @Override
    public void speedUp(int value) {
        super.speedUp(value);
        if (value < 20) {
            System.out.println("Bicycle can be speeded up");
        } else if (value >= 20 && value <= 30) {
            System.out.println("Bicycle is moving with normal speed");
        } else {
            applyBrake(value);
        }
    }

    @Override
    public void applyBrake(int value) {
        super.applyBrake(value);
        if (value > 30) {
            System.out.println("Bicycle is moving too fast. Apply brake!");
        } else {
            System.out.println("Bicycle is moving with normal speed");
        }
    }

    public void move() {
        System.out.println("Bicycle is moving!");
    }

    public abstract void changeGear();
}
