package kreacyjne.abstractFactory.zadanie2;

public abstract class BikeFactory {

    public static Bike create5KrossBike(){
        return new Bike("Kross", 1, 5, BikeType.BICYCLE);
    }
    public static Bike create6MeridaBike(){
        return new Bike("Merida", 1, 6, BikeType.BICYCLE);
    }
    public static Bike create3IndianaTandem(){
        return new Bike("Indiana", 2, 3, BikeType.TANDEM);
    }
    public static Bike create6FeltBike(){
        return new Bike("Felt", 1, 6, BikeType.BICYCLE);
    }
    public static Bike create1GoetzeTandem(){
        return new Bike("Goetze", 2, 1, BikeType.TANDEM);
    }
}
