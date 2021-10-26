package home.work14;

public enum Goods {

    SHIRT("Shirt", 57.99),
    SUMMER_DRESS("Summer dress", 89.99),
    PANTS("Men's pants", 79.00),
    JACKET("Jacket", 125.30),
    TWEED_SUIT("Tweed suit", 399.99),
    WOOL_COAT("Wool coat", 456.55);

    private String goodsName;
    private double goodsPrice;

    Goods(String name, double price) {
        this.goodsName = name;
        this.goodsPrice = price;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }
}
