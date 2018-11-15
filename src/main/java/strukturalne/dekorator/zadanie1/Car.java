package strukturalne.dekorator.zadanie1;

public class Car implements ICar{
    private double chargerPressure;
    private double engineCapacity;
    private int seatsNumber;
    private boolean hasCharger;
    private double horsePower;

    public Car(double chargerPressure, double engineCapacity, int seatsNumber, boolean hasCharger, double horsePower) {
        this.chargerPressure = chargerPressure;
        this.engineCapacity = engineCapacity;
        this.seatsNumber = seatsNumber;
        this.hasCharger = hasCharger;
        this.horsePower = horsePower;
    }

    @Override
    public double getHorsePower() {
        return 0;
    }

    @Override
    public boolean isHasCharger() {
        return false;
    }

    @Override
    public double getEngineCapacity() {
        return 0;
    }

    @Override
    public double getChargerPressure() {
        return 0;
    }

    @Override
    public ICar getCar() {
        return null;
    }
}
