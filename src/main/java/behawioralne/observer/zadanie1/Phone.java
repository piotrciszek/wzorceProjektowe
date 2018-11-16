package behawioralne.observer.zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Phone implements Observer {
    private String numerTelefonu;
    private List<String> inbox = new ArrayList<>();

    public Phone(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof  Message);
        Message wiadomosc = (Message) arg;
        if (wiadomosc.getNumer().equals(numerTelefonu)){
            inbox.add(wiadomosc.getTresc());
            System.out.println("Dostalem wiadomosc " + wiadomosc.getNumer());
        }
    }
}
