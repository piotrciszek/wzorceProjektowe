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
    public double getChargerPressure() {
        return chargerPressure;
    }

    public Car setChargerPressure(double chargerPressure) {
        this.chargerPressure = chargerPressure;
        return this;
    }

    @Override
    public double getEngineCapacity() {
        return engineCapacity;
    }

    public Car setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
        return this;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public Car setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
        return this;
    }

    public boolean isHasCharger() {
        return hasCharger;
    }

    public Car setHasCharger(boolean hasCharger) {
        this.hasCharger = hasCharger;
        return this;
    }

    @Override
    public double getHorsePower() {
        return horsePower;
    }

    public Car setHorsePower(double horsePower) {
        this.horsePower = horsePower;
        return this;
    }
}
