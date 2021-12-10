package home.work11.Restaurant;

public class Restaurant {

    public void getNameAndPrice(Dish dish) {
        System.out.println("Dish name: " + dish.getDishName() + ". Dish price " + dish.getDishPrice() + " UAH");
    }

    public void printMenu(Dish dish) {
        System.out.println("Category: " + dish.getCategory());
        getNameAndPrice(dish);
        System.out.println("Ingredients: " + dish.ingredients());
    }

    public void selectDish(Dish dish) {
        printMenu(dish);
        System.out.println("Expected time of preparation: " + dish.getReparationTime());
    }

    public String getName(Dish dish) {
        return dish.getDishName();
    }
}





