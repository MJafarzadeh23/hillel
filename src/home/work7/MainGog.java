package home.work7;

public class MainGog {
    // Create new class Dog, which has one static method and one static field.
    // Print out value of this variable, add usage of static method in main

    public static void main(String[] args) {

        Dog dog1 = new Dog("eskimo dog", "white", 5);
        Dog dog2 = new Dog("collie", "black", 3);
        System.out.println(Dog.getDogCounter() + " dogs were created");
        System.out.println("Dogs: " + '\n' + dog1.toString() + '\n' + dog2.toString());
        // set dogs number as 10 using static method
        Dog.SetDogsCounter(10);
        // add more dogs to 10
        Dog dog3 = new Dog("shepherd", "brown", 10);
        Dog dog4 = new Dog("shepherd", "brown", 3);
        System.out.println("Number of dogs is " + Dog.getDogCounter() + ", according to changed counter");



        // another static method to calculate dog's age that corresponds typed human age
        // call the static method to print dog's age
        System.out.println("_____________________________________________________________");
        DogAge.printDogsAge(DogAge.inputHumanAge());
    }
}
