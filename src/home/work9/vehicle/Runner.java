package home.work9.vehicle;

public class Runner {
    public static void main(String[] args) {

        Bicycle bike1 = new MountainBicycle("Top Mount", 20, 3, 2020);
        MountainBicycle mountBike1 = new MountainBicycle();
        Bicycle bike2 = new RoadBicycle("Road Star", 40, 28, 2021);
        Bicycle bike3 = new RoadBicycle("Road Star", 40, 28, 2021);
        Bicycle bike4 = new RoadBicycle("Top Road", 40, 22, 2020);
        RoadBicycle roadBike1 = new RoadBicycle();
        Vehicle helicopter1 = new Helicopter();
        Vehicle helicopter2 = new Helicopter("Safety Fly", 150, 3, 1000, 100);
        Vehicle helicopter3 = new Helicopter("Rich High", 200, 2, 2000, 150);
        Vehicle helicopter4 = helicopter2;
        Vehicle car1 = new Car();
        Vehicle car2 = new Car();

        mountBike1.setSeatHeight(1);
        System.out.println("Mount bike has seat height of " + mountBike1.getSeatHeight() + " m");
        roadBike1.setRudderDepth(2);
        System.out.println("Road bike has rudder depth of " + roadBike1.getRudderDepth() + " m");
        System.out.println("changeGear method---------------------------------------------------------------------------");
        bike1.changeGear();
        bike2.changeGear();
        System.out.println("speedUp bicycle#1 --------------------------------------------------------------------------");
        bike1.speedUp(5);
        System.out.println("applyBrake bicycle#1------------------------------------------------------------------------");
        bike1.applyBrake(10);
        System.out.println("speedUp bicycle#2 --------------------------------------------------------------------------");
        bike2.speedUp(40);
        System.out.println("applyBrake bicycle#2------------------------------------------------------------------------");
        bike2.applyBrake(35);
        System.out.println("move bicycle#2------------------------------------------------------------------------------");
        mountBike1.move();

        System.out.print("Helicopter model is " + helicopter2.getModel()+ ". ");
        helicopter2.move();
        System.out.println("--------------------------------------------------------------------------------------------");
        Car.setCarType("Sedan");
        Car.setTransmission("mechanic");
        car1.move();
        Car.setCarType("Truck");
        Car.setTransmission("automatic");
        car2.move();
        System.out.println("--------------------------------------------------------------------------------------------");


        System.out.println("helicopter2 == helicopter3: different instances, override, same class: " + (helicopter2 == helicopter3) + " false"); // false
        System.out.println("helicopter2.equals(helicopter3): different instances, override, same class: " + helicopter2.equals(helicopter3) + " false"); // false
        System.out.println("New object. Override. HashCodes - helicopter2: " + helicopter2.hashCode() + ", helicopter3: " + helicopter3.hashCode());
        System.out.println("helicopter4 == helicopter2: same storage, same class: " + (helicopter4 == helicopter2) + " true");
        System.out.println("HashCodes of objects from the same storage - helicopter4: " + helicopter4.hashCode() + ", helicopter2: " + helicopter2.hashCode());

        System.out.println("bike2 == bike3: same instances, wot override, same class: " + (bike2 == bike3) + " false");
        System.out.println("bike2.equals(bike3): same instances, wot override, same class: " + bike2.equals(bike3) + " false");
        System.out.println("New object. Wot override. HashCodes - bike2: " + bike2.hashCode() + ", bike3: " + bike3.hashCode());
    }
}
