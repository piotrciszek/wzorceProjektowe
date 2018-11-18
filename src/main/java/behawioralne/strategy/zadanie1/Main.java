package behawioralne.strategy.zadanie1;

public class Main {
    public static void main(String[] args) {
        Samochod samochodS = new Samochod("AD90123", new SilnikSplinowy(), 70, 30, 0);

        samochodS.przyspiesz();
        samochodS.przyspiesz();
        samochodS.zwolnij();
        System.out.println(samochodS);
    }
}
