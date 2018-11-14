package kreacyjne.abstractFactory.zadanie2;

public class Main {
    public static void main(String[] args) {
        Bike b1 = BikeFactory.create1GoetzeTandem();
        Bike b2 = BikeFactory.create5KrossBike();

        System.out.println(b1);
        System.out.println(b2);
    }
}
