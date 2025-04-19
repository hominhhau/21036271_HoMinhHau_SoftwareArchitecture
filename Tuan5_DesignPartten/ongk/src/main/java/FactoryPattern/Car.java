package FactoryPattern;

public abstract class Car {
     public abstract  String getCarName();
     public abstract  String getCarType();
     public abstract  String getCarColor();
     public abstract  String getCarPrice();

        @Override
        public String toString() {
            return "Car Name: " + getCarName()  + "getCarType: " + getCarType() + "getCarColor: " + getCarColor() + "getCarPrice: " + getCarPrice();
        }





}
