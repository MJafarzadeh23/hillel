package home.work10.vehicleInterface;

public class Helicopter2 implements VehicleInterface2 {

    public String helicopterModel;
    public int helicopterSpeed;
    public int maxHeight;

    public Helicopter2() {
    }

    public Helicopter2(String model, int vehicleSpeed, int maxHeight) {
        this.helicopterModel = model;
        this.helicopterSpeed = vehicleSpeed;
        this.maxHeight = maxHeight;
    }

    public void speedUp(int value) {
        if (helicopterSpeed < value) {
            System.out.println("Helicopter can be speeded up");
        } else {
            applyBrake(value);
        }
    }

    public void applyBrake(int value) {
        if (helicopterSpeed >= value) {
            System.out.println("Helicopter is moving too fast. Apply brake!");
        } else {
            System.out.println("Helicopter is moving with normal speed");
        }
    }

    @Override
    public void move() {
        System.out.println("Helicopter is flying with a speed of " + helicopterSpeed + " km/h");;
    }
}
