package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new BaseBeverage();
        System.out.println(beverage.getDescription() + " costs " + beverage.cost());

        Beverage cream = new Cream(new BaseBeverage());
        System.out.println(cream.getDescription() + " costs " + cream.cost());

        Beverage syrup = new Syrup(new BaseBeverage());
        System.out.println(syrup.getDescription() + " costs " + syrup.cost());


        Beverage creamSyrup = new Cream(new Syrup( new Bubble(new BaseBeverage())));
        System.out.println(creamSyrup.getDescription() + " costs " + creamSyrup.cost());

    }
}
