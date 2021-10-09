package home.work10.vehicleInterface;

public interface VehicleInterface2 {

    void speedUp(int value);

    void applyBrake(int value);

    default void move() {
        System.out.println("Vehicle is moving!");
    }

    static void stop(VehicleInterface2 vehicle) {
        System.out.println("Stop the vehicle!");
    }
}