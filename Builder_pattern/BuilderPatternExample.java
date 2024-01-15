package Builder_pattern;

// Usage
public class BuilderPatternExample {
    public static void main(String[] args) {
        Meal meal1 = new Meal.MealBuilder().addBurger("Cheese Burger").addDrink("Coke").build();
        Meal meal2 = new Meal.MealBuilder().addBurger("Zinger Burger").addDrink("Pepsi").addFries("French fries")
                .addDessert("Rasgulla").build();
        System.out.println("Meal 1: " + meal1.getBurger() + ", " + meal1.getDrink() + ", " + meal1.getDessert());
        System.out.println("Meal 2: " + meal2.getBurger() + ", " + meal2.getDrink() + ", " + meal2.getFries() + ", "
                + meal2.getDessert());
    }
}
