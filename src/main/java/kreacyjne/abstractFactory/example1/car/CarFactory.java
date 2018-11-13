package kreacyjne.abstractFactory.example1.car;

public abstract class CarFactory {

    public static Car createAudiA4() {
        return new Car("Audi", 60, "A4", 1988);
    }

    public static Car createBMW16() {
        return new Car("BMW", 59, "e36", 1998);
    }
}
