package home.work14;

import java.util.Map;

public class ShopMain {
    public static void main(String[] args) {

        // В отдельном классе в мейн методе вызвать методы по очереди: конвертируем enum в Map,
        // выводим его содержимое на экран, применяем скидку, выводим содержимое на экран после скидки

        Shop goods = new Shop();

        Map items = goods.convertEnumToMap();
        System.out.println(items);
        System.out.println("    Goods with full price:");
        goods.printGoods(items);
        Map itemsWithDiscount = goods.applyDiscountToGoods(items);
        System.out.println("    Goods with seasonal discount of " + goods.getSeasonalDiscount() * 100 + "% ->");
        goods.printGoods(itemsWithDiscount);
    }
}
