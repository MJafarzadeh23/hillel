package home.work11.Atelier;

public class Atelier {
    // Создать класс Ателье, содержащий методы одетьЖенщину, одетьМужчину, на вход которых будет поступать массив,
    // содержащий все типы одежды (Clothes[] clothes). Метод одетьЖенщину выводит на консоль всю информацию о женской одежде.
    // То же самое для метода одетьМужчину.


    //Clothing cloths = new Clothing();

    //Clothing[] clothes = {itemTShirt, itemPants, itemSkirt, itemTie};

    // Юбкa
    //Размер М (евро размер: 38), Взрослый размер
    //Стоимость: 200 грн
    //Цвет: синий

    public void dressAMan(Clothing[] clothes) {
        System.out.println("Men's Clothes");
        for (Clothing clothesItem : clothes)
        {
            if (clothesItem instanceof TShirt || clothesItem instanceof Pants || clothesItem instanceof Tie) {
                System.out.println(clothesItem.getItemName());
                System.out.println("Size: " + clothesItem.getItemSize().name() + " (euro size: " + clothesItem.getItemSize().getEuroSize() + "), " + clothesItem.getItemSize().getDescription());
                System.out.println("Price: " + clothesItem.getItemPrice());
                System.out.println("Color: " + clothesItem.getItemColor());
                System.out.println("--------------------------------------------");
            }
        }
    }

    public void dressAWoman(Clothing[] clothes) {
        System.out.println("Women's Clothes");
        for (Clothing clothesItem : clothes)
        {
            if (clothesItem instanceof TShirt || clothesItem instanceof Pants || clothesItem instanceof Skirt) {
                System.out.println(clothesItem.getItemName());
                System.out.println("Size: " + clothesItem.getItemSize().name() + " (euro size: " + clothesItem.getItemSize().getEuroSize() + "), " + clothesItem.getItemSize().getDescription());
                System.out.println("Price: " + clothesItem.getItemPrice());
                System.out.println("Color: " + clothesItem.getItemColor());
                System.out.println("--------------------------------------------");
            }
        }
    }




}
