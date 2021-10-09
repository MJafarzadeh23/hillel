package home.work10.vehicleInterface;

// speedUp(int value) means: speedUp till value, if value < vehicleSpeed
// applyBrake(int value) means: applyBrake at value, if value > vehicleSpeed

public class VehicleMain {
    public static void main(String[] args) {

        VehicleInterface2 bike1 = new MountainBicycle2("Top Mount", 20, 3, 2020);
        VehicleInterface2 bike2 = new MountainBicycle2("Mount Trace", 35, 10);
        VehicleInterface2 bike3 = new RoadBicycle2("Road Star", 15, 12, 2020);
        VehicleInterface2 bike4 = new RoadBicycle2();
        VehicleInterface2 car1 = new Car2("Sedan", 50, "mechanic");
        VehicleInterface2 car2 = new Car2("Truck", 100, "automatic");
        VehicleInterface2 helicopter1 = new Helicopter2("Safety Fly", 150, 1000);
        VehicleInterface2 helicopter2 = new Helicopter2("Rich High", 200, 2000);

        VehicleInterface2[] vehicles = {bike1, bike2, bike3, bike4, car1, car2, helicopter1, helicopter2};

        for (VehicleInterface2 vehicle: vehicles) {
            vehicle.move();
            if (vehicle instanceof MountainBicycle2 || vehicle instanceof RoadBicycle2) {
                vehicle.speedUp(25);
                vehicle.applyBrake(30);

                if (vehicle instanceof MountainBicycle2) {
                    ((MountainBicycle2) vehicle).changeGear();
                    System.out.print("Bicycle was produced in ");
                    System.out.println(((MountainBicycle2) vehicle).getProductionYear());
                } else {
                    ((RoadBicycle2) vehicle).changeGear();
                    System.out.print("Bicycle was produced in ");
                    System.out.println(((RoadBicycle2) vehicle).getProductionYear());
                }
            } else if (vehicle instanceof Car2) {
                vehicle.speedUp(70);
                vehicle.applyBrake(100);
            } else if (vehicle instanceof Helicopter2) {
                vehicle.speedUp(160);
                vehicle.applyBrake(220);
            } else {
                System.out.println("Don't know such vehicle!");
            }

            VehicleInterface2.stop(vehicle);
            System.out.println("-------------------------------------");
        }
    }
}
