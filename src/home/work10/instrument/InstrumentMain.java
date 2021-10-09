package home.work10.instrument;

public class InstrumentMain {
    public static void main(String[] args) {
        Instrument guitar1 = new Guitar(5);
        Instrument drum1 = new Drum(14);
        Instrument trumpet1 = new Trumpet(2);
        Instrument guitar2 = new Guitar(7);

        Instrument[] musicInstr = {guitar1, drum1, trumpet1, guitar2};

        System.out.print(guitar1.getClass().getSimpleName() + ": ");
        guitar1.chooseScale("D major");
        System.out.print(drum1.getClass().getSimpleName() + ": ");
        drum1.chooseScale("C major");

        System.out.println("--------------------------------------------------------------");
        for (Instrument instr: musicInstr) {
            if (instr instanceof Guitar) {
                instr.play(((Guitar)instr).getNumberOfStrings());
            } else if (instr instanceof Drum) {
                instr.play(((Drum)instr).getDrumSize());
            } else if (instr instanceof Trumpet) {
                instr.play(((Trumpet)instr).getTrumpetSize());
            } else {
                System.out.println("We don't have such instrument");
            }
        }
    }
}
