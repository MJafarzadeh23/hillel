package home.work10.instrument;

public class Drum implements Instrument {

    private int drumSize;

    public Drum(int drumSize) {
        this.drumSize = drumSize;
    }

    @Override
    public void play(int drumSize) {
        System.out.println("Drum is playing! The size of drum is " + drumSize + " inches in diameter");
    }

    public int getDrumSize() {
        return drumSize;
    }
}
