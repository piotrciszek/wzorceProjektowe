package kreacyjne.abstractFactory.zadanie1.computer;

public abstract class AbstractPC {
    private String tekst;
    private COMPUTER_BRAND computer_brand;
    private int cpu_power;
    private double gpu_power;
    private boolean isOverclocked;

    public AbstractPC(String tekst, COMPUTER_BRAND computer_brand, int cpu_power, double gpu_power, boolean isOverclocked) {
        this.tekst = tekst;
        this.computer_brand = computer_brand;
        this.cpu_power = cpu_power;
        this.gpu_power = gpu_power;
        this.isOverclocked = isOverclocked;
    }

    @Override
    public String toString() {
        return "AbstractPC{" +
                "tekst='" + tekst + '\'' +
                ", computer_brand=" + computer_brand +
                ", cpu_power=" + cpu_power +
                ", gpu_power=" + gpu_power +
                ", isOverclocked=" + isOverclocked +
                '}';
    }
}
