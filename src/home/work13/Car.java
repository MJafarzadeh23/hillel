package home.work13;

public class Car extends Vehicle {
    // Класс автомобиль должен иметь следующие поля: марка, кол-во дверей, тип транспортного средства (легковой/грузовой),
    // цвет автомобиля, номерной знак. Наследуется от Vehicle.

    private String carModel;
    private int doorsNum;
    private CarType carTypeEnum;

    enum CarType {CAR, TRUCK}

    public Car(String color, int plateNumber,  CarType carType, String model,  int doorsNumber) {
        super(color, plateNumber);
        this.carTypeEnum = carType;
        this.carModel = model;
        this.doorsNum = doorsNumber;
    }

    public CarType getCarTypeEnum() {
        return carTypeEnum;
    }
}
