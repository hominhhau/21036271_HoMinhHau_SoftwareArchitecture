package FactoryPattern;

public class Truck extends  Car{
    private String carName;
    private String carType;
    private String carColor;
    private String carPrice;

    public Truck(String carName, String carType, String carColor, String carPrice) {
        this.carName = carName;
        this.carType = carType;
        this.carColor = carColor;
        this.carPrice = carPrice;
    }


    @Override
    public String getCarName() {
        return carName;
    }

    @Override
    public String getCarType() {
        return carType;
    }

    @Override
    public String getCarColor() {
        return carColor;
    }

    @Override
    public String getCarPrice() {
        return carPrice;
    }
}
