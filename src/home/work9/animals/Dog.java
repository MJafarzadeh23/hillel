package home.work9.animals;

import home.work9.animals.Animal;

public class Dog extends Animal {

    private String special;

    public Dog(String food, String place, String ableToFind) {
        super(food, place);
        this.special = ableToFind;
    }

    public void makeNoise() {
        System.out.println("Woof woof!");
    }

    public void eat() {
        System.out.println("The animal eats " + getFood() + " usually");
    }

    public String getSpecial() {
        return special;
    }
}
