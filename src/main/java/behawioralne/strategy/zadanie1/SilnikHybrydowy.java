package behawioralne.strategy.zadanie1;

public class SilnikHybrydowy implements INaped {
    @Override
    public double getPoborPraduSilnik() {
        return 5;
    }

    @Override
    public double getPoborPaliwaSilnika() {
        return 5;
    }

    @Override
    public double getMocSilnika() {
        return 100;
    }
}
