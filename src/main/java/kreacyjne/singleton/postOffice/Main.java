package kreacyjne.singleton.postOffice;

public class Main {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        postOffice.fromAutomat();
        postOffice.fromWebsite();
        postOffice.fromWindow();
    }
}
