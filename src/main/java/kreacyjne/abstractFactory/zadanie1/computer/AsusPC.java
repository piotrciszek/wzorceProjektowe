package kreacyjne.abstractFactory.zadanie1.computer;

public class AsusPC extends AbstractPC {
    public AsusPC(String tekst, COMPUTER_BRAND computer_brand, int cpu_power, double gpu_power, boolean isOverclocked) {
        super(tekst, computer_brand, cpu_power, gpu_power, isOverclocked);
    }
    public static AbstractPC createAsusXD() {
        return new AsusPC("XD", COMPUTER_BRAND.ASUS, 1000, 1200.0, false);
    }
    public static AbstractPC createAsusMR() {
        return new AsusPC("MR", COMPUTER_BRAND.ASUS, 1200, 1500.0, true);
    }
}
