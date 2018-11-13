package kreacyjne.builder.pieczatka;

public class Main {
    public static void main(String[] args) {
        Stamp stamp1 = new Stamp.Builder()
                .setFirstDayNumber(1)
                .setSecondDayNumber(2)
                .setYearNumber1(2)
                .setYearNumber2(0)
                .setYearNumber3(1)
                .setYearNumber4(9)
                .build();

        System.out.println(stamp1);

    }


}
