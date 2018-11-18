package behawioralne.strategy.zadanie1;

public class SamochodElektryczny implements INaped {
    @Override
    public double getPoborPraduSilnik() {
        return +10;
    }

    @Override
    public double getPoborPaliwaSilnika() {
        return 0;
    }

    @Override
    public double getMocSilnika() {
        return 100;
    }
}
