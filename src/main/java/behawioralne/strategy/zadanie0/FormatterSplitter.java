package behawioralne.strategy.zadanie0;

public class FormatterSplitter implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZmiany) {
        String result = "";
        for (int i=0; i<tekstDoZmiany.trim().length(); i++){
            result += tekstDoZmiany.charAt(i) + " ";
        }
        return result;
    }
}
