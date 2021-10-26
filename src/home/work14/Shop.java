package home.work14;

import java.util.HashMap;
import java.util.Map;

public class Shop {

    private double seasonalDiscount = 0.40;

    public Map<String, Double> convertEnumToMap() {
        Map<String, Double> goods = new HashMap<>();
        goods.put(Goods.SUMMER_DRESS.getGoodsName(), Goods.SUMMER_DRESS.getGoodsPrice());
        goods.put(Goods.SHIRT.getGoodsName(), Goods.SHIRT.getGoodsPrice());
        goods.put(Goods.PANTS.getGoodsName(), Goods.PANTS.getGoodsPrice());
        goods.put(Goods.JACKET.getGoodsName(), Goods.JACKET.getGoodsPrice());
        goods.put(Goods.TWEED_SUIT.getGoodsName(), Goods.TWEED_SUIT.getGoodsPrice());
        goods.put(Goods.WOOL_COAT.getGoodsName(), Goods.WOOL_COAT.getGoodsPrice());

        return goods;
    }

    public void printGoods(Map<String, Double> mapOfGoods) {
        mapOfGoods.forEach((key, value) ->
                System.out.println("Price of item " + key + " is " + String.format("%.2f", (double) value)  + " UAH"));
    }

    public Map<String, Double> applyDiscountToGoods(Map<String, Double> fullPriceGoods) {
        for(Map.Entry<String, Double> entry : fullPriceGoods.entrySet()) {
            entry.setValue(entry.getValue() * (1 - seasonalDiscount));
        }
        return fullPriceGoods;
    }

    public double getSeasonalDiscount() {
        return seasonalDiscount;
    }
}
