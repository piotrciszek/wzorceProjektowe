package strukturalne.dekorator.zadanie0;

public class Main {
    public static void main(String[] args) {
        Bohater superman = new Bohater("Superman");
        System.out.println(superman);

        BohaterNaKoniu bohaterNaKoniu = new BohaterNaKoniu(superman);
        System.out.println(bohaterNaKoniu);

        System.out.println(superman.getAttackPoints());
        System.out.println(bohaterNaKoniu.getAttackPoints());
    }
}
