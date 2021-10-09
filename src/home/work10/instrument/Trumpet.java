package home.work10.instrument;

public class Trumpet implements Instrument {

    private int trumpetSize;

    public Trumpet(int trumpetSize) {
        this.trumpetSize = trumpetSize;
    }

    @Override
    public void play(int trumpetSize) {
        System.out.println("Trumpet is playing! The size of trumpet is " + trumpetSize + " inches in diameter");
    }

    public int getTrumpetSize() {
        return trumpetSize;
    }
}
