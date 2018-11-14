package kreacyjne.abstractFactory.zadanie2;

public class Bike {
    private String marka;
    private int iloscMiejsc;
    private int iloscPrzerzutek;
    private BikeType bikeType;

    public Bike(String marka, int iloscMiejsc, int iloscPrzerzutek, BikeType bikeType) {
        this.marka = marka;
        this.iloscMiejsc = iloscMiejsc;
        this.iloscPrzerzutek = iloscPrzerzutek;
        this.bikeType = bikeType;
    }

    public String getMarka() {
        return marka;
    }

    public Bike setMarka(String marka) {
        this.marka = marka;
        return this;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public Bike setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
        return this;
    }

    public int getIloscPrzerzutek() {
        return iloscPrzerzutek;
    }

    public Bike setIloscPrzerzutek(int iloscPrzerzutek) {
        this.iloscPrzerzutek = iloscPrzerzutek;
        return this;
    }

    public BikeType getBikeType() {
        return bikeType;
    }

    public Bike setBikeType(BikeType bikeType) {
        this.bikeType = bikeType;
        return this;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "marka='" + marka + '\'' +
                ", iloscMiejsc=" + iloscMiejsc +
                ", iloscPrzerzutek=" + iloscPrzerzutek +
                ", bikeType=" + bikeType +
                '}';
    }
}
