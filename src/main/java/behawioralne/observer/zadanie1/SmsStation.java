package behawioralne.observer.zadanie1;

import java.util.Observable;

public class SmsStation extends Observable {

    public void addPhone(Phone p){
        addObserver(p);
    }
    public void sendSms(String numer, String tresc){
        setChanged();
        notifyObservers(new Message(numer, tresc));
    }
}
