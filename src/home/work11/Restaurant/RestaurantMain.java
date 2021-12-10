package home.work11.Restaurant;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        Dish[] dishes = Dish.values();

        for (Dish dish : dishes) {
            rest.printMenu(dish);
            System.out.println("------------------------------------------------------------------------");
        }
        System.out.println("***********************************************************************");
        Dish selectedDish = Dish.MARGHERITA;
        System.out.println("You chose: " + rest.getName(selectedDish));
        rest.selectDish(selectedDish);
    }
}
