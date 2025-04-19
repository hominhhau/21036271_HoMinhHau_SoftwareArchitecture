package DecoratorPattern;

public class Cream extends BeverageDecorator {
    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + 3.0;
    }
}