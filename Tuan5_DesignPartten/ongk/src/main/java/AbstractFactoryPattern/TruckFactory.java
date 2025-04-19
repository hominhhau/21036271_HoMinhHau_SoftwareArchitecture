package AbstractFactoryPattern;

public class TruckFactory implements CarAbstractFactory{

    private String carName;
    private String carType;
    private String carColor;
    private String carPrice;

    public TruckFactory(String carName, String carType, String carColor, String carPrice) {
        this.carName = carName;
        this.carType = carType;
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    @Override
    public Car createCar() {
        return new Truck(carName, carType, carColor, carPrice);
    }
}
