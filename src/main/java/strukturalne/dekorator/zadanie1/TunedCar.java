package strukturalne.dekorator.zadanie1;

public class TunedCar implements ICar{
    private ICar tunedCar;
    private double pressureAdded;
    private double horsePowerMultiplier;
    private boolean setCharger;
    private double engineCapacityMultiplier;

    public TunedCar(ICar tunedCar, double pressureAdded, double horsePowerMultiplier, boolean setCharger, double engineCapacityMultiplier) {
        this.tunedCar = tunedCar;
        this.pressureAdded = pressureAdded;
        this.horsePowerMultiplier = horsePowerMultiplier;
        this.setCharger = setCharger;
        this.engineCapacityMultiplier = engineCapacityMultiplier;
    }

    @Override
    public double getHorsePower() {
        return tunedCar.getHorsePower() * horsePowerMultiplier;
    }

    @Override
    public boolean isHasCharger() {
        return setCharger;
    }

    @Override
    public double getEngineCapacity() {
        return tunedCar.getEngineCapacity() * engineCapacityMultiplier;
    }

    @Override
    public double getChargerPressure() {
        return tunedCar.getChargerPressure() + pressureAdded;
    }

    @Override
    public ICar getCar() {
        return tunedCar;
    }
    public static class Builder {
        private ICar tunedCar;
        private double pressureAdded;
        private double horsePowerMultiplier;
        private boolean setCharger;
        private double engineCapacityMultiplier;

        public ICar getTunedCar() {
            return tunedCar;
        }

        public Builder setTunedCar(ICar tunedCar) {
            this.tunedCar = tunedCar;
            return this;
        }

        public double getPressureAdded() {
            return pressureAdded;
        }

        public Builder setPressureAdded(double pressureAdded) {
            this.pressureAdded = pressureAdded;
            return this;
        }

        public double getHorsePowerMultiplier() {
            return horsePowerMultiplier;
        }

        public Builder setHorsePowerMultiplier(double horsePowerMultiplier) {
            this.horsePowerMultiplier = horsePowerMultiplier;
            return this;
        }

        public boolean isSetCharger() {
            return setCharger;
        }

        public Builder setSetCharger(boolean setCharger) {
            this.setCharger = setCharger;
            return this;
        }

        public double getEngineCapacityMultiplier() {
            return engineCapacityMultiplier;
        }

        public Builder setEngineCapacityMultiplier(double engineCapacityMultiplier) {
            this.engineCapacityMultiplier = engineCapacityMultiplier;
            return this;
        }
        public TunedCar createTunedCar(){
            return new TunedCar(tunedCar, pressureAdded, horsePowerMultiplier, setCharger, engineCapacityMultiplier);
        }
    }
}
