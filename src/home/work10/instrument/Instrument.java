package home.work10.instrument;

public interface Instrument {

    String KEY = "C Major";

    default void chooseScale(String scale) {
        if (!KEY.equalsIgnoreCase(scale)) {
            System.out.println("It cant be played!");
            return;
        }
        System.out.println("playing the simplest scale C Major");
    }
    void play(int characteristic);
}
