package behawioralne.strategy.zadanie0;

public class FormatterInverter implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZmiany) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<tekstDoZmiany.trim().length(); i++){
            char c = tekstDoZmiany.charAt(i);
            if (Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            } else if (Character.isSpaceChar(c)){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
