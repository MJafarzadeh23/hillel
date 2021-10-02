package home.work9.vehicle;

public class RoadBicycle extends Bicycle {

    private int rudderDepth;

    public RoadBicycle() {
    }

    public RoadBicycle(String model, int bicycleSpeed, int gear, int id) {
        super(model, bicycleSpeed, gear, id);
    }

    public void setRudderDepth(int value) {
        this.rudderDepth = value;
    }

    public int getRudderDepth() {
        return rudderDepth;
    }

    public void changeGear() {
        if (super.gear < 22) {
            System.out.println("Road bicycle has up to 22 gears. You can use it");
        } else {
            System.out.println("Don't know bicycle model with such speeds");
        }
    }
}
