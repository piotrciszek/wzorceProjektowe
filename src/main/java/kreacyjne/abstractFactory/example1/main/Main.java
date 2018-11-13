package kreacyjne.abstractFactory.example1.main;

import kreacyjne.abstractFactory.example1.car.Car;
import kreacyjne.abstractFactory.example1.car.CarFactory;

public class Main {
    public static void main(String[] args) {
        Car audi = CarFactory.createAudiA4();
        Car bmw = CarFactory.createBMW16();
//        Car car = new Car(); - nie mozna stworzyc bo konstruktor Car nie jest public
        System.out.println(audi);
    }
}
