package behawioralne.strategy.zadanie1;

public class SilnikSplinowy implements INaped{
    @Override
    public double getPoborPraduSilnik() {
        return -1;
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
