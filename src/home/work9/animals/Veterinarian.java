package home.work9.animals;

public class Veterinarian {

    public static void main(String[] args) {
        Animal dog1 = new Dog("meat", "home","drugs seeker");
        Animal cat1 = new Cat("meat and fish", "home", "warmth hunter");
        Animal horse1 = new Horse("hay", "reservation", "fast");

        /*Cat cat2 = new Cat("milk", "home", "warm");
        cat2.getSpecial();*/

        Animal[] animals = {dog1, cat1, horse1};
        Veterinarian vet = new Veterinarian();

        for (Animal animal: animals) {
            System.out.print("Veterinarian will check " + animal.getClass().getSimpleName() + ", which talks ");
            animal.makeNoise();
            vet.treatAnimal(animal);
            animal.eat();
            animal.sleep();
            System.out.println("-------------------------------------------------------------");
        }
    }

    public void treatAnimal(Animal animal) {
        System.out.println("Prefered food is " + animal.getFood() + ". It lives in " + animal.getLocation());
    }
}
