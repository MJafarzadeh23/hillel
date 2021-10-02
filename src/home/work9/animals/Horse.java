package home.work9.animals;

import home.work9.animals.Animal;

public class Horse extends Animal {

    private String special;

    public Horse(String food, String place, String speed) {
        super(food, place);
        this.special = speed;
    }

    public void makeNoise() {
        System.out.println("Neeeeigh!");
    }

    public void eat() {
        System.out.println("The animal eats " + getFood());
    }

    public String getSpecial() {
        return special;
    }
}
