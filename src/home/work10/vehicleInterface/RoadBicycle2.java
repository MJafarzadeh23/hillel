package home.work10.vehicleInterface;

public class RoadBicycle2 implements BicycleInterface2 {

    public String roadBikeModel;
    public int bicycleSpeed;
    public int gear;
    private int productionYear;

    public RoadBicycle2() {
    }

    public RoadBicycle2(String model, int vehicleSpeed, int gear) {
        this.roadBikeModel = model;
        this.bicycleSpeed = vehicleSpeed;
        this.gear = gear;
    }

    public RoadBicycle2(String model, int vehicleSpeed, int gear, int year) {
        this.roadBikeModel = model;
        this.bicycleSpeed = vehicleSpeed;
        this.gear = gear;
        this.productionYear = year;
    }

    public void changeGear() {
        if (gear < 22) {
            System.out.println("Road bicycle has up to 22 gears. You can use it");
        } else {
            System.out.println("Don't know bicycle model with such speeds");
        }
    }

    public int getProductionYear() {
        return productionYear;
    }
}
