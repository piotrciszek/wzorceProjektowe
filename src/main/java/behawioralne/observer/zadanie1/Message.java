package behawioralne.observer.zadanie1;

public class Message {
    private String numer;
    private String tresc;

    public Message(String numer, String tresc) {
        this.numer = numer;
        this.tresc = tresc;
    }

    public String getNumer() {
        return numer;
    }

    public Message setNumer(String numer) {
        this.numer = numer;
        return this;
    }

    public String getTresc() {
        return tresc;
    }

    public Message setTresc(String tresc) {
        this.tresc = tresc;
        return this;
    }
}
