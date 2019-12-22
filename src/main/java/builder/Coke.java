package builder;

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 6.5f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
