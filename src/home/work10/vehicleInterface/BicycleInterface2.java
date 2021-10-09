package home.work10.vehicleInterface;

public interface BicycleInterface2 extends VehicleInterface2 {

    int MAX_SPEED = 30;

    default void speedUp(int value) {
        if (value < MAX_SPEED) {
            System.out.println("Bicycle can be speeded up");
        } else {
            applyBrake(value);
        }
    }

    default void applyBrake(int value) {
        if (value >= MAX_SPEED) {
            System.out.println("Bicycle is moving too fast. Apply brake!");
        } else {
            System.out.println("Bicycle is moving with normal speed");
        }
    }

    @Override
    default void move() {
        System.out.println("Bicycle is moving!");
    }

    void changeGear();
}
