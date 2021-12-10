package home.work11.Atelier;

public class Pants extends Clothing implements MensClothing,WomenClothing {

    Pants() {}

    Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressAMan() {
        System.out.println("Men's Pants");
    }

    @Override
    public void dressAWoman() {
        System.out.println("Women's Pants");
    }

    public String getItemName() {
        return "Pants";
    }
}
