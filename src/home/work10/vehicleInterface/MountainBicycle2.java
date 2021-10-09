package home.work10.vehicleInterface;

public class MountainBicycle2 implements BicycleInterface2 {

    public String mountBikeModel;
    public int bicycleSpeed;
    public int gear;
    private int productionYear;

    public MountainBicycle2() {
    }

    public MountainBicycle2(String model, int vehicleSpeed, int gear) {
        this.mountBikeModel = model;
        this.bicycleSpeed = vehicleSpeed;
        this.gear = gear;
    }

    public MountainBicycle2(String model, int vehicleSpeed, int gear, int year) {
        this.mountBikeModel = model;
        this.bicycleSpeed = vehicleSpeed;
        this.gear = gear;
        this.productionYear = year;
    }

    public void changeGear() {
        if (gear >= 4 && gear <= 8) {
            System.out.println("You might want to use low gears. You can do it");
        } else if (gear > 0 && gear < 4) {
            System.out.println("You are using low gears");
        } else {
            System.out.println("You are out of speeds");
        }
    }

    public int getProductionYear() {
        return productionYear;
    }
}
