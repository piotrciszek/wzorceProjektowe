package strukturalne.dekorator.zadanie0;

public class BohaterNaKoniu implements IBohater {
    private Bohater bohaterToDecorate;

    public BohaterNaKoniu(Bohater bohaterToDecorate) {
        this.bohaterToDecorate = bohaterToDecorate;
    }

    @Override
    public int getHealth() {
        return bohaterToDecorate.getHealth() + 200;
    }

    @Override
    public int getStamina() {
        return (int) (bohaterToDecorate.getStamina() *1.2);
    }

    @Override
    public int getDefencePoints() {
        return bohaterToDecorate.getDefencePoints() + 10;
    }

    @Override
    public int getAttackPoints() {
        return bohaterToDecorate.getAttackPoints() + 50;
    }

    @Override
    public String toString() {
        return "BohaterNaKoniu{" +
                "bohaterToDecorate=" + bohaterToDecorate +
                '}';
    }
}
