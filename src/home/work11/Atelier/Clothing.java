package home.work11.Atelier;

public abstract class Clothing {
    //Создать абстрактный класс Одежда, содержащий переменные - размер одежды (Size size),
    // стоимость, цвет. Добавить конструктор для инициализации полей класса.

    private Size itemSize;
    private int itemPrice;
    private String itemColor;

    Clothing() {
    }

    Clothing(Size size, int price, String color) {
        this.itemSize = size;
        this.itemPrice = price;
        this.itemColor = color;
    }

    public Size getItemSize() {
        return itemSize;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public String getItemColor() {
        return itemColor;
    }

    public abstract String getItemName();
}
