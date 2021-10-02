package home.work9.vehicle;

public class MountainBicycle extends Bicycle {

    private int seatHeight;

    public MountainBicycle() {
    }

    public MountainBicycle(String model, int bicycleSpeed, int gear, int id) {
        super(model, bicycleSpeed, gear, id);
    }

    public void setSeatHeight(int value) {
        this.seatHeight = value;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void changeGear() {
        if (super.gear >= 4 && super.gear <= 8) {
            System.out.println("You might want to use low gears. You can do it");
        } else if (super.gear > 0 && super.gear < 4) {
            System.out.println("You are using low gears");
        } else {
            System.out.println("You are out of speeds");
        }
    }
}
