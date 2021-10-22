package home.work13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Vehicle {

    private String vehicleModel;
    private String vehicleColor;
    private int vehiclePlateNumber;

    public Vehicle() {
    }

    public Vehicle(String model, String color, int plateNumber) {
        this.vehicleModel = model;
        this.vehicleColor = color;
        this.vehiclePlateNumber = plateNumber;
    }

    public static List<Vehicle> getVehicleList() {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("BMW", "red", 1568));
        vehicleList.add(new Vehicle("Ducati", "green", 2306));
        vehicleList.add(new Vehicle("Chevrolet", "grey", 1389));
        vehicleList.add(new Vehicle("Mercedes", "dark blue", 5687));
        vehicleList.add(new Vehicle("Honda", "red", 0201));
        vehicleList.add(new Vehicle("Ford", "black", 9685));
        vehicleList.add(new Vehicle("Ford", "grey", 6597));
        vehicleList.add(new Vehicle("Chevrolet", "black", 6574));

        return vehicleList;
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

    /*public static void main(String[] args) {
        for (int i = 0; i < getVehicleList().size(); i++) {
            System.out.println(getVehicleList().get(i));
        }
        System.out.println(Arrays.toString(getVehicleList().toArray()));
    }*/


    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleModel='" + vehicleModel + '\'' +
                ", vehicleColor='" + vehicleColor + '\'' +
                ", vehiclePlateNumber=" + vehiclePlateNumber +
                '}';
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public int getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }
}
