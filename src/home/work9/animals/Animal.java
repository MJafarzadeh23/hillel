package home.work9.animals;

public abstract class Animal {

    private String food;
    private String location;

    public Animal(String food, String place) {
        this.food = food;
        this.location = place;
    }

    public abstract void makeNoise();

    public void eat() {
        System.out.println("I eat " + food);
    }

    public void sleep() {
        System.out.println("Now animal is sleeping");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
