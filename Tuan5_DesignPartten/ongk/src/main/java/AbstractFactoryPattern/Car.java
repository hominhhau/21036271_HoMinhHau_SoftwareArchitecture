package AbstractFactoryPattern;

public abstract class Car {
     public abstract  String getCarName();
     public abstract  String getCarType();
     public abstract  String getCarColor();
     public abstract  String getCarPrice();

        @Override
        public String toString() {
            return "Car Name: " + getCarName() + "\n" +
                    "Car Type: " + getCarType() + "\n" +
                    "Car Color: " + getCarColor() + "\n" +
                    "Car Price: " + getCarPrice() + "\n";
        }





}
