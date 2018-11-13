package kreacyjne.abstractFactory.zadanie1.computer;

public class SamsungPC extends AbstractPC {
    public SamsungPC(String tekst, COMPUTER_BRAND computer_brand, int cpu_power, double gpu_power, boolean isOverclocked) {
        super(tekst, computer_brand, cpu_power, gpu_power, isOverclocked);
    }
}
