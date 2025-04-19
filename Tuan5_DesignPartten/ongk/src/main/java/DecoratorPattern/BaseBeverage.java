package DecoratorPattern;

// Concrete Component
public class BaseBeverage implements Beverage {
    @Override
    public String getDescription() {
        return "Base Beverage";
    }

    @Override
    public double cost() {
        return 10.0; // Giá cơ bản
    }
}

