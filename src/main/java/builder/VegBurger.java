package builder;

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Vegetarian Burger!";
    }
}
