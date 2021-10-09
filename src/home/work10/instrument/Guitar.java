package home.work10.instrument;

public class Guitar implements Instrument {

    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play(int numberOfStrings) {
        System.out.println("Guitar is playing! It has " + numberOfStrings + " strings");
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
