package strukturalne.dekorator.zadanie1;

public class CarFactory extends Car{
    public CarFactory(double chargerPressure, double engineCapacity, int seatsNumber, boolean hasCharger, double horsePower) {
        super(chargerPressure, engineCapacity, seatsNumber, hasCharger, horsePower);
    }
    public static ICar createCheapCar(){
        return new Car(25, 50, 4, false, 80);
    }
    public static ICar createMidCar(){
        return new Car(50, 70, 5, true, 100);
    }
    public static ICar createBestCar(){
        return new Car(75, 100, 6, true, 130);
    }
}
