package behawioralne.strategy.zadanie1;

public class Main {
    public static void main(String[] args) {
        Samochod samochodS = new Samochod("AD90123", new SilnikSplinowy());
        Samochod samochodH = new Samochod("DA87442", new SilnikHybrydowy());
        Samochod samochodE = new Samochod("EL63110", new SamochodElektryczny());
        samochodS.przyspiesz();
        samochodS.przyspiesz();
        samochodS.zwolnij();
        System.out.println(samochodS);
        System.out.println();
        samochodH.przyspiesz();
        samochodH.przyspiesz();
        samochodH.zwolnij();
        System.out.println(samochodH);
        System.out.println();
        samochodE.przyspiesz();
        samochodE.przyspiesz();
        samochodE.zwolnij();
        System.out.println(samochodE);


    }
}
