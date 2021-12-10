package home.work11.Atelier;

public class Tie extends Clothing implements MensClothing {

    Tie() {}

    Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressAMan() {
        System.out.println("Tie");
    }

    public String getItemName() {
        return "Tie";
    }
}
