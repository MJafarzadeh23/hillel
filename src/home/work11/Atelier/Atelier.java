package home.work11.Atelier;

public class Atelier {

    public void dressAMan(Clothing[] clothes) {
        System.out.println("Men's Clothes");
        for (Clothing clothesItem : clothes)
        {
            if (clothesItem instanceof MensClothing) {
                dressAPerson(clothesItem);
            }
        }
    }

    public void dressAWoman(Clothing[] clothes) {
        System.out.println("Women's Clothes");
        for (Clothing clothesItem : clothes) {
            if (clothesItem instanceof WomenClothing) {
                dressAPerson(clothesItem);
            }
        }
    }

    public void dressAPerson(Clothing clothesItem) {
        System.out.println(clothesItem.getItemName());
        System.out.println("Size: " + clothesItem.getItemSize().name() + " (euro size: " + clothesItem.getItemSize().getEuroSize() + "), " + clothesItem.getItemSize().getDescription());
        System.out.println("Price: " + clothesItem.getItemPrice());
        System.out.println("Color: " + clothesItem.getItemColor());
        System.out.println("--------------------------------------------");
    }
}
