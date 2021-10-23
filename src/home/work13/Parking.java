package home.work13;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    private final int MAX_SLOTS = 10;
    private static int vehicleCounter = 0;

    public void park(Vehicle vehcl) {
        List<Vehicle> auhorizedVehicles = Parking.getVehicleList();

        try {
            if (vehicleCounter >= MAX_SLOTS) {
                throw new Exception("The is no available parking slots!");
            } else if (vehcl instanceof Car && ((Car) vehcl).getCarTypeEnum() == Car.CarType.TRUCK) {
                throw new TruckIsNotAllowedException("TRUCK is not allowed.............!");
            } else {
                if (auhorizedVehicles.contains(vehcl)) {
                    System.out.println("Vehicle was parked!");
                    vehicleCounter++;
                } else {
                    throw new NotAuthorizedVehicleException("Vehicle is not authorized to park!");
                }
            }
        } catch (NotAuthorizedVehicleException e) {
            System.out.println("Vehicle is not authorized to park!");
        } catch (TruckIsNotAllowedException e) {
            System.out.println("TRUCK is not allowed.............!");
        } catch (Exception e) {
            System.out.println("The is no available parking slots!");
        }
        System.out.println(vehicleCounter + " vehicles in parking.");
    }

    public static List<Vehicle> getVehicleList() {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("red", 1568, "BMW"));
        vehicleList.add(new Vehicle("green", 2306, "Ducati"));
        vehicleList.add(new Vehicle("grey", 1389, "Chevrolet"));
        vehicleList.add(new Vehicle("dark blue", 5687, "Mercedes"));
        vehicleList.add(new Vehicle("red", 0201, "Honda"));
        vehicleList.add(new Vehicle("black", 9685, "Ford"));
        vehicleList.add(new Vehicle("grey", 6597, "Ford"));
        vehicleList.add(new Vehicle("black", 6574, "Chevrolet"));
        vehicleList.add(new Vehicle("white", 9988, "Ducati"));
        vehicleList.add(new Vehicle("black", 2313,"Bugatti Veyron"));
        vehicleList.add(new Vehicle("blue",1120,"Audi"));

        return vehicleList;
    }
}

