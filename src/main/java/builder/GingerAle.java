package builder;

public class GingerAle extends ColdDrink {

    @Override
    public float price() {
        return 5.5f;
    }

    @Override
    public String name() {
        return "Ginger Ale";
    }
}
