package home.work13;

public class ParkingMain {
    public static void main(String[] args) {

        Parking moto = new Parking();

        Vehicle moto1 = new Motorcycle("green",2306, "BMW");        //parked
        Vehicle moto2 = new Motorcycle("red", 0201, "Honda");       //parked
        Vehicle moto3 = new Motorcycle("red", 8954, "Honda");       //not allowed
        Vehicle moto4 = new Motorcycle("white", 9988, "Ducati");    //parked
        Vehicle moto5 = new Motorcycle("red", 1568, "BMW");         //parked
        Vehicle car1 = new Car("grey", 1389,Car.CarType.CAR, "Mercedes", 2);        //parked
        Vehicle car2 = new Car("dark blue",5686,Car.CarType.TRUCK,"Mercedes", 2);   //not allowed
        Vehicle car3 = new Car("dark blue",5687,Car.CarType.CAR,"Chevrolet", 4);    //parked
        Vehicle car4 = new Car("black", 9685, Car.CarType.CAR, "Ford", 2);          //parked
        Vehicle car5 = new Car("grey", 6597, Car.CarType.TRUCK, "Ford", 2);         //not allowed
        Vehicle car6 = new Car("grey", 6597, Car.CarType.CAR, "Ford", 2);           //parked
        Vehicle car7 = new Car("black", 6574, Car.CarType.CAR, "Chevrolet", 4);     //parked
        Vehicle car8 = new Car("black", 2313, Car.CarType.CAR, "Bugatti Veyron", 2);//parked
        Vehicle car9 = new Car("blue", 1120, Car.CarType.CAR, "Audi", 4);           //parking is full

        Vehicle[] vehicles = {moto1,moto2,car1,car2,car3,moto3,car4,car5,car6,moto4,moto5,car7,car8,car9};

        for (Vehicle vehicle: vehicles) {
            moto.park(vehicle);
        }
    }
}
