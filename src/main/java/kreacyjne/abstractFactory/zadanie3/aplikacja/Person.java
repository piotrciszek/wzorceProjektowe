package kreacyjne.abstractFactory.zadanie3.aplikacja;

public class Person {
    private String imie;
    private String nazwisko;
    private String index;

    public Person(String imie, String nazwisko, String index) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", index='" + index + '\'' +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public Person setImie(String imie) {
        this.imie = imie;
        return this;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Person setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }

    public String getIndex() {
        return index;
    }

    public Person setIndex(String index) {
        this.index = index;
        return this;
    }
}
