package home.work13;

public class Parking {

    private final int MAX_SLOTS = 10;
    private static int vehicleCounter = 0;


    public void park(Vehicle vehcl) {
        try {
            for (int i = 0; i < Vehicle.getVehicleList().size(); i++) {
                if (vehicleCounter <= MAX_SLOTS) {
                    if (vehcl instanceof Motorcycle) {
                        if (Vehicle.getVehicleList().get(i).getVehicleColor().equals(((Motorcycle) vehcl).getMotorcycleColor())
                                && Vehicle.getVehicleList().get(i).getVehiclePlateNumber() == (((Motorcycle) vehcl).getMotorcyclePlateNumber())) {
                            System.out.println("Motorcycle is parked");
                            vehicleCounter++;
                        } else {
                            throw new ParkingIsNotAllowedException("Parking is not allowed!");
                        }
                    } else if (vehcl instanceof Car) {
                        if (((Car) vehcl).getCarTypeEnum() == Car.CarType.TRUCK) {
                            throw new ParkingIsNotAllowedException("Parking is not allowed!");
                        } else if (Vehicle.getVehicleList().get(i).getVehicleColor().equals(((Car) vehcl).getCarColor())
                                && Vehicle.getVehicleList().get(i).getVehiclePlateNumber() == (((Car) vehcl).getCarPlateNumber())) {
                            System.out.println("Car is parked");
                            vehicleCounter++;
                        }
                    }
                } else {
                    System.out.println("Parking is full!");
                    break;
                }
            }
        } catch (ParkingIsNotAllowedException e) {
                System.out.println("Parking is not allowed!");
        }
        System.out.println(vehicleCounter);
    }
}

