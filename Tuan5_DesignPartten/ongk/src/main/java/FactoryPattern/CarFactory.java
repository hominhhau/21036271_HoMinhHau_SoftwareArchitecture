package FactoryPattern;

public class CarFactory {
    public static Car getCar(String carType, String carName, String carColor, String carPrice) {
        if (carType.equalsIgnoreCase("Sedan")) {
            return new Sedan(carName, carType, carColor, carPrice);
        } else if (carType.equalsIgnoreCase("Truck")) {
            return new Truck(carName, carType, carColor, carPrice);
        }
        return null;
    }
}
