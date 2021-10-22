package home.work13;

public class Car extends Vehicle {
    // Класс автомобиль должен иметь следующие поля: марка, кол-во дверей, тип транспортного средства (легковой/грузовой),
    // цвет автомобиля, номерной знак. Наследуется от Vehicle.

    private String carModel;
    private int doorsNum;
    private /*final*/ CarType carTypeEnum;
    private String carColor;
    private int carPlateNumber;

    enum CarType {CAR, TRUCK}

    public Car(String model, int doorsNumber, CarType carType, String color, int plateNumber) {
        this.carModel = model;
        this.doorsNum = doorsNumber;
        this.carTypeEnum = carType;
        this.carColor = color;
        this.carPlateNumber = plateNumber;
    }

    public String getCarColor() {
        return carColor;
    }

    public int getCarPlateNumber() {
        return carPlateNumber;
    }

    public CarType getCarTypeEnum() {
        return carTypeEnum;
    }
}
