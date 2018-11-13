package kreacyjne.abstractFactory.zadanie1.main;

import kreacyjne.abstractFactory.zadanie1.computer.AbstractPC;
import kreacyjne.abstractFactory.zadanie1.computer.ApplePC;
import kreacyjne.abstractFactory.zadanie1.computer.AsusPC;

public class Main {
    public static void main(String[] args) {
        AbstractPC apple1 = ApplePC.createMacAir();
        AbstractPC asus2 = AsusPC.createAsusMR();

        System.out.println(apple1);
        System.out.println(asus2);
    }
}
