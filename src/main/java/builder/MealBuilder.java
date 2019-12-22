package builder;

public class MealBuilder {

    public Meal prepareNonVegMeal() {

        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());

        return meal;

    }

    public Meal prepareVegMeal() {

        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new GingerAle());

        return meal;

    }

}
