package strukturalne.dekorator.zadanie1;

public class Main {
    public static void main(String[] args) {
        ICar car1 = CarFactory.createCheapCar();
        ICar car2 = CarFactory.createMidCar();
        ICar car3 = CarFactory.createBestCar();

        CarShop carShop = new CarShop();
        ICar tunedCar1 = carShop.addSeats(car1);
        ICar tunedCar2 = carShop.addExtraCharger(car2);
        ICar tunedCar3 = carShop.addExtraEngine(car3);

        System.out.println(car1);
        System.out.println(tunedCar1);
        System.out.println();
        System.out.println(car2);
        System.out.println(tunedCar2);
        System.out.println();
        System.out.println(car3);
        System.out.println(tunedCar3);
    }
}
