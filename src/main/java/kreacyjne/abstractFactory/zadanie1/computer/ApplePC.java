package kreacyjne.abstractFactory.zadanie1.computer;

public class ApplePC extends AbstractPC {
    public ApplePC(String tekst, COMPUTER_BRAND computer_brand, int cpu_power, double gpu_power, boolean isOverclocked) {
        super(tekst, computer_brand, cpu_power, gpu_power, isOverclocked);

    }
    public static AbstractPC createMacPC() {
        return new ApplePC("MacPC", COMPUTER_BRAND.APPLE, 800, 750.0, false);
    }
    public static AbstractPC createMacAir() {
        return new ApplePC("MacAir", COMPUTER_BRAND.APPLE, 1800, 1000.0, true);
    }

}
