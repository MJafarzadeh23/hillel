package home.work13;

import home.work10.vehicleInterface.VehicleInterface2;

public class ParkingMain {
    public static void main(String[] args) {

        //vehicleList.add(new Vehicle("Ducati", "green", 2306));
        //vehicleList.add(new Vehicle("Honda", "red", 0201));
        //vehicleList.add(new Vehicle("Chevrolet", "grey", 1389));
        //vehicleList.add(new Vehicle("Mercedes", "dark blue", 5687));

        Parking moto = new Parking();

        Vehicle moto1 = new Motorcycle("BMW", "green", 2306);   //parked
        Vehicle moto2 = new Motorcycle("Honda", "red",0201);    //parked
        Vehicle moto3 = new Motorcycle("Honda", "red", 8954);   //not allowed
        Vehicle car1 = new Car("Mercedes", 2, Car.CarType.CAR, "grey", 1389); //parked
        Vehicle car2 = new Car("Mercedes", 2, Car.CarType.TRUCK,"dark blue", 5686); //not allowed
        Vehicle car3 = new Car("Chevrolet", 4, Car.CarType.CAR, "dark blue", 5687); //parked

        Vehicle[] vehicles = {moto1, moto2, moto3, car1, car2, car3};

        for (Vehicle vehicle: vehicles) {
            moto.park(vehicle);
        }
        /*moto.park(moto1);
        moto.park(moto2);
        moto.park(moto3);*/
    }
}
