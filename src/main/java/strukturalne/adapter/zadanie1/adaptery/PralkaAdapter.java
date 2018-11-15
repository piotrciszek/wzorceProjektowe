package strukturalne.adapter.zadanie1.adaptery;

import strukturalne.adapter.zadanie1.ISwitchable;
import strukturalne.adapter.zadanie1.urzadzenia.Pralka;

public class PralkaAdapter implements ISwitchable {
    private Pralka pralka;

    public PralkaAdapter(Pralka pralka) {
        this.pralka = pralka;
    }

    @Override
    public void turn_on() {
        pralka.turnOn();
    }

    @Override
    public void turn_of() {
        pralka.turnOff();
    }
}
