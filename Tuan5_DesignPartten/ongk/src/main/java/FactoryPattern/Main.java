package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car sedan = carFactory.getCar("Sedan", "Sedan 1", "Red", "100000");
        Car truck = carFactory.getCar("Truck", "Truck 1", "Blue", "200000");

        System.out.println("sedan"+sedan);
        System.out.println("truck"+truck);

    }
}
