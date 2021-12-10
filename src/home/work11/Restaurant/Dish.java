package home.work11.Restaurant;

public enum Dish {
    MARGHERITA("Pizza Margherita",120,15) {
        @Override public String ingredients() {
            return "Triveri tomato, mozzarella di bufala, basil";
        }
    },
    FETTUCCINE_MEATBALLS ("Pasta Fettuccine Meatballs",130,15) {
        @Override public String ingredients() {
            return "Hand cut fettuccine, Sicilian style meatballs, Triveri tomato sugo";
        }
    },
    CHICKEN_PARMIGIANA("Chicken Parmigiana",130,20) {
        @Override public String ingredients() {
            return "Schnitzel topped with napoli sauce & mozzarella served with chips";
        }
    },
    FOCACCIA("Focaccia",50,5) {
        @Override
        public String ingredients() {
            return "Caroli extra virgin olive oil, garlic, sicilian sea salt";
        }
        public String getCategory() {
            return "Starter";
        }
    },
    PANNA_COTTA("Panna Cotta",80,5) {
        @Override
        public String ingredients() {
            return "Eggless vanilla bean custard with marinated berries";
        }
        public String getCategory() {
            return "Dessert";
        }
    },
    TIRAMISU("Tiramisu",70,5){
        @Override
        public String ingredients() {
            return "Ladyfingers, espresso and kahlua layered with chocolate shavings & mascarpone zabaione";
        }
        public String getCategory() {
            return "Dessert";
        }
    };

    private String dishName;
    private int dishPrice;
    private int reparationTime;

    Dish(String name, int price, int time) {
        this.dishName = name;
        this.dishPrice = price;
        this.reparationTime = time;
    }

    public abstract String ingredients();

    public String getCategory() {
        return "Main dish";
    }

    public String getDishName() {
        return dishName;
    }

    public int getDishPrice() {
        return dishPrice;
    }

    public int getReparationTime() {
        return reparationTime;
    }
}
