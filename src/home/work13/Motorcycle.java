package home.work13;

public class Motorcycle extends Vehicle {
    // Класс мотоцикл должен состоять из полей: марка, цвет. нормерной знак. Наследуется от Vehicle.

    private String motorcycleModel;
    private String motorcycleColor;
    private int motorcyclePlateNumber;

    public Motorcycle(String model, String color, int plateNumber) {
        this.motorcycleModel = model;
        this.motorcycleColor = color;
        this.motorcyclePlateNumber = plateNumber;
    }

    public String getMotorcycleColor() {
        return motorcycleColor;
    }

    public int getMotorcyclePlateNumber() {
        return motorcyclePlateNumber;
    }
}
