package home.work11.Atelier;

public class TShirt extends Clothing implements MensClothing,WomenClothing {

    TShirt() {}

    TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressAMan() {
        System.out.println("Men's T-Shirt");
    }

    @Override
    public void dressAWoman() {
        System.out.println("Women's T-Shirt");
    }

    public String getItemName() {
        return "TShirt";
    }
}
