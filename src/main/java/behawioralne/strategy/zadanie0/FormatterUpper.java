package behawioralne.strategy.zadanie0;

public class FormatterUpper implements IFormatterCzcionki {

    @Override
    public String zamienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.toUpperCase();
    }
}
