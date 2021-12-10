package home.work11.Atelier;

public class AtelierMain {
    public static void main(String[] args) {
        Clothing itemTShirt = new TShirt(Size.M, 200, "Grey");
        Clothing itemPants1 = new Pants(Size.L, 400, "Black");
        Clothing itemSkirt = new Skirt(Size.S, 200, "Red");
        Clothing itemTie = new Tie(Size.M, 500, "Blue");
        Clothing itemPants2 = new Pants(Size.XXS, 100, "Green");

        Clothing[] clothesArr = {itemTShirt,itemPants1,itemSkirt,itemTie,itemPants2};

        Atelier atelier = new Atelier();

        atelier.dressAMan(clothesArr);
        atelier.dressAWoman(clothesArr);

    }
}
