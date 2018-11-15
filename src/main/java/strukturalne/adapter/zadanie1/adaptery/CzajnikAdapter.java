package strukturalne.adapter.zadanie1.adaptery;

import strukturalne.adapter.zadanie1.ISwitchable;
import strukturalne.adapter.zadanie1.urzadzenia.Czajnik;

public class CzajnikAdapter implements ISwitchable {
    private Czajnik czajnik;

    public CzajnikAdapter(Czajnik czajnik) {
        this.czajnik = czajnik;
    }

    @Override
    public void turn_on() {
        czajnik.wlacz();
    }

    @Override
    public void turn_of() {
        czajnik.wylacz();
    }
}
