package AbstractFactoryPattern;

public class SedanFactory implements CarAbstractFactory{

    private String carName;
    private String carType;
    private String carColor;
    private String carPrice;

    public SedanFactory(String carName, String carType, String carColor, String carPrice) {
        this.carName = carName;
        this.carType = carType;
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    @Override
    public Car createCar() {
        return new Sedan(carName, carType, carColor, carPrice);
    }
}
