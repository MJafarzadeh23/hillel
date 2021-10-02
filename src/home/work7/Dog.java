package home.work7;

public class Dog {

    private static int dogCounter = 0;

    private String breed;
    private String color;
    int age;

    public Dog(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        dogCounter++;
    }

    public static void SetDogsCounter(int dogCounter) {
        Dog.dogCounter = dogCounter;
    }

    public static int getDogCounter() {
        return dogCounter;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
