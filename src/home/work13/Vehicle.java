package home.work13;

import java.util.Objects;

public class Vehicle {

    private String vehicleModel;
    private String vehicleColor;
    private int vehiclePlateNumber;

    public Vehicle() {
    }

    public Vehicle(String color, int plateNumber, String model) {
        this.vehicleColor = color;
        this.vehiclePlateNumber = plateNumber;
        this.vehicleModel = model;
    }

    public Vehicle(String color, int plateNumber) {
        this.vehicleColor = color;
        this.vehiclePlateNumber = plateNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return vehiclePlateNumber == vehicle.vehiclePlateNumber && Objects.equals(vehicleColor, vehicle.vehicleColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleColor, vehiclePlateNumber);
    }
}
