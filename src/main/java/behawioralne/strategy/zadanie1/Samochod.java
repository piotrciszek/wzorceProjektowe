package behawioralne.strategy.zadanie1;

public class Samochod {
    private String nrRejestracyjny;
    private INaped silnik;
    private double predkosc = 0;
    private double iloscPaliwa = 60;
    private double poziomAkumulatorow = 60;

    public Samochod(String nrRejestracyjny, INaped silnik) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.silnik = silnik;
    }

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public Samochod setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
        return this;
    }

    public INaped getSilnik() {
        return silnik;
    }

    public Samochod setSilnik(INaped silnik) {
        this.silnik = silnik;
        return this;
    }

    public double getPredkosc() {
        return predkosc;
    }

    public Samochod setPredkosc(double predkosc) {
        this.predkosc = predkosc;
        return this;
    }

    public double getIloscPaliwa() {
        return iloscPaliwa;
    }

    public Samochod setIloscPaliwa(double iloscPaliwa) {
        this.iloscPaliwa = iloscPaliwa;
        return this;
    }

    public double getPoziomAkumulatorow() {
        return poziomAkumulatorow;
    }

    public Samochod setPoziomAkumulatorow(double poziomAkumulatorow) {
        this.poziomAkumulatorow = poziomAkumulatorow;
        return this;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "nrRejestracyjny='" + nrRejestracyjny + '\'' +
                ", silnik=" + silnik +
                ", predkosc=" + predkosc +
                ", iloscPaliwa=" + iloscPaliwa +
                ", poziomAkumulatorow=" + poziomAkumulatorow +
                '}';
    }
    public void przyspiesz(){
        predkosc = predkosc +10;
        iloscPaliwa = iloscPaliwa - silnik.getPoborPaliwaSilnika();
        poziomAkumulatorow = poziomAkumulatorow - silnik.getPoborPraduSilnik();
    }
    public void zwolnij(){
        predkosc = predkosc-10;
        iloscPaliwa = iloscPaliwa;
        poziomAkumulatorow = poziomAkumulatorow + silnik.getPoborPraduSilnik();
    }
}
