package home.work13;

public class Motorcycle extends Vehicle {
    // Класс мотоцикл должен состоять из полей: марка, цвет. нормерной знак. Наследуется от Vehicle.

    private String motorcycleModel;

    public Motorcycle(String color, int plateNumber, String model) {
        super(color, plateNumber);
        this.motorcycleModel = model;
    }
}
