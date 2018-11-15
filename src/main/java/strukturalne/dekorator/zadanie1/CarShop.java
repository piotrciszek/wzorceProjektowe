package strukturalne.dekorator.zadanie1;

public class CarShop {

    public ICar addExtraCharger(ICar car) {
        boolean charger = true;
        if (car.isHasCharger()){
            charger = false;
        }
        return new TunedCar.Builder().setTunedCar(car).setPressureAdded(20).setSetCharger(charger).setHorsePowerMultiplier(1.5).setEngineCapacityMultiplier(1).createTunedCar();
    }
    public ICar addExtraEngine(ICar car){
        return new TunedCar.Builder().setTunedCar(car).setHorsePowerMultiplier(2).setEngineCapacityMultiplier(3).createTunedCar();
    }
    public ICar addSeats(ICar car) {
        return new TunedCar.Builder().setTunedCar(car).setHorsePowerMultiplier(0.5).setEngineCapacityMultiplier(1).createTunedCar();
    }
}
