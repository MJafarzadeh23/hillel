package home.work9.animals;

import home.work9.animals.Animal;

public class Cat extends Animal {

    private String special;

    public Cat(String food, String place, String temperature) {
        super(food, place);
        this.special = temperature;
    }

    public void makeNoise() {
        System.out.println("Meow...");
    }

    public void eat() {
        System.out.println("The animal is given " + getFood() + " three times per day");
    }

    public String getSpecial() {
        return special;
    }
}
