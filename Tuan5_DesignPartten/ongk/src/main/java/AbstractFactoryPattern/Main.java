package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {

        CarAbstractFactory sedanFactory = new SedanFactory("Sedan by hau", "Sedan", "Red", "100000");
        CarAbstractFactory truckFactory = new TruckFactory("Truck 1", "Truck", "Blue", "200000");

        Car sedan = sedanFactory.createCar();
        Car truck = truckFactory.createCar();

        System.out.println("sedan"+sedan);
        System.out.println("truck"+truck);


    }
}
