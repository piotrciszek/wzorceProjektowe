package strukturalne.adapter.zadanie1;

import strukturalne.adapter.zadanie1.adaptery.CzajnikAdapter;
import strukturalne.adapter.zadanie1.adaptery.LampkaAdapter;
import strukturalne.adapter.zadanie1.adaptery.PralkaAdapter;
import strukturalne.adapter.zadanie1.urzadzenia.Czajnik;
import strukturalne.adapter.zadanie1.urzadzenia.Lampka;
import strukturalne.adapter.zadanie1.urzadzenia.Pralka;

import java.util.ArrayList;
import java.util.List;

public class Dom {
    private List<ISwitchable> listaUrzadzen = new ArrayList<>();

    public Dom(List<ISwitchable> listaUrzadzen) {
        this.listaUrzadzen = listaUrzadzen;
    }

    public Dom(){
        listaUrzadzen.add(new CzajnikAdapter(new Czajnik()));
        listaUrzadzen.add(new LampkaAdapter(new Lampka()));
        listaUrzadzen.add(new PralkaAdapter(new Pralka()));
    }

    public void wlaczWszytsko(){
        for (ISwitchable z: listaUrzadzen){
            z.turn_on();
        }
    }
    public void wylaczWszystko(){
        for (ISwitchable z: listaUrzadzen){
            z.turn_of();
        }
    }
}
