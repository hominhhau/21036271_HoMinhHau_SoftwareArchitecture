package DecoratorPattern;

public class Syrup extends BeverageDecorator {
    public Syrup(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Syrup";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.5;
    }
}