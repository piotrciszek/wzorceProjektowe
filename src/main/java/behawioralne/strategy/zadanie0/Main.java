package behawioralne.strategy.zadanie0;

public class Main {
    public static void main(String[] args) {
        IFormatterCzcionki formatterLower = new FormatterLower();
        System.out.println(formatterLower.zamienTekst("  ADADSAEW"));
        IFormatterCzcionki formatterUpper = new FormatterUpper();
        System.out.println(formatterUpper.zamienTekst(" asdADdaqwA"));
        IFormatterCzcionki formatterTrim = new FormatterTrim();
        System.out.println(formatterTrim.zamienTekst(" ASddas awAWWvfGG  "));
        IFormatterCzcionki formatterInverter = new FormatterInverter();
        System.out.println(formatterInverter.zamienTekst(" aLKfbMNu tRA"));
        IFormatterCzcionki formatterSplitter = new FormatterSplitter();
        System.out.println(formatterSplitter.zamienTekst("  ADasd daewqtgh LKF"));
    }
}
