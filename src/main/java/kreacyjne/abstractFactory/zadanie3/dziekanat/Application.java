package kreacyjne.abstractFactory.zadanie3.dziekanat;

import java.time.LocalDate;

public class Application {
    private LocalDate dataUtworzenia;
    private String miejsceUtworzenia;
    private Person daneAplikanta;
    private String tresc;

    public Application(LocalDate dataUtworzenia, String miejsceUtworzenia, Person daneAplikanta, String tresc) {
        this.dataUtworzenia = dataUtworzenia;
        this.miejsceUtworzenia = miejsceUtworzenia;
        this.daneAplikanta = daneAplikanta;
        this.tresc = tresc;
    }

    public LocalDate getDataUtworzenia() {
        return dataUtworzenia;
    }

    public Application setDataUtworzenia(LocalDate dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
        return this;
    }

    public String getMiejsceUtworzenia() {
        return miejsceUtworzenia;
    }

    public Application setMiejsceUtworzenia(String miejsceUtworzenia) {
        this.miejsceUtworzenia = miejsceUtworzenia;
        return this;
    }

    public Person getDaneAplikanta() {
        return daneAplikanta;
    }

    public Application setDaneAplikanta(Person daneAplikanta) {
        this.daneAplikanta = daneAplikanta;
        return this;
    }

    public String getTresc() {
        return tresc;
    }

    public Application setTresc(String tresc) {
        this.tresc = tresc;
        return this;
    }

    @Override
    public String toString() {
        return "Application{" +
                "dataUtworzenia=" + dataUtworzenia +
                ", miejsceUtworzenia='" + miejsceUtworzenia + '\'' +
                ", daneAplikanta=" + daneAplikanta +
                ", tresc='" + tresc + '\'' +
                '}';
    }
}
