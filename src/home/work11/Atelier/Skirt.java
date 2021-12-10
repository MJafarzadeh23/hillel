package home.work11.Atelier;

public class Skirt extends Clothing implements WomenClothing {

    Skirt() {}

    Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressAWoman() {
        System.out.println("Skirt");
    }

    public String getItemName() {
        return "Skirt";
    }
}
