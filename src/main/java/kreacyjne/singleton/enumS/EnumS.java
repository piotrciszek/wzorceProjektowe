package kreacyjne.singleton.enumS;

public enum EnumS {
    INSTANCE;

    EnumS() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void doSomething() {
        //do something
    }
}
