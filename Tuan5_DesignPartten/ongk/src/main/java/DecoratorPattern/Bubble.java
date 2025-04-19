package DecoratorPattern;

// Concrete Decorator - Bubble
public class Bubble extends BeverageDecorator {
    public Bubble(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Bubble";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.0;
    }
}