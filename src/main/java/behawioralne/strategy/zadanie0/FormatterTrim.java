package behawioralne.strategy.zadanie0;

public class FormatterTrim implements IFormatterCzcionki{
    @Override
    public String zamienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.trim();
    }
}
