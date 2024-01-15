package Builder_pattern;

// Product Class
public class Meal {
    private String burger;
    private String drink;
    private String fries;
    private String dessert;

    // Constructor is made private to enforce the use of Builder
    private Meal() {
    }

    public String getBurger() {
        return burger;
    }

    public String getDrink() {
        return drink;
    }

    public String getFries() {
        return fries;
    }

    public String getDessert() {
        return dessert;
    }

    // Builder class
    static class MealBuilder {
        private Meal meal = new Meal();

        public MealBuilder addBurger(String burger) {
            meal.burger = burger;
            return this;
        }

        public MealBuilder addDrink(String drink) {
            meal.drink = drink;
            return this;
        }

        public MealBuilder addFries(String fries) {
            meal.fries = fries;
            return this;
        }

        public MealBuilder addDessert(String dessert) {
            meal.dessert = dessert;
            return this;
        }

        public Meal build() {
            return meal;
        }
    }
}
