package strukturalne.adapter.zadanie1.adaptery;

import strukturalne.adapter.zadanie1.ISwitchable;
import strukturalne.adapter.zadanie1.urzadzenia.Lampka;

public class LampkaAdapter implements ISwitchable {
    private Lampka lampka;

    public LampkaAdapter(Lampka lampka) {
        this.lampka = lampka;
    }

    @Override
    public void turn_on() {
        lampka.switchOn();
    }

    @Override
    public void turn_of() {
        lampka.switchOff();
    }
}
