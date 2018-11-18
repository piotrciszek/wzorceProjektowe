package behawioralne.strategy.zadanie0;

public class Main {
    public static void main(String[] args) {
        IFormatterCzcionki formatter = new FormatterLower();
        System.out.println(formatter.zamienTekst("ADADSAEW"));
    }
}
