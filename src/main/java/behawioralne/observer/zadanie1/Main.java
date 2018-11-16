package behawioralne.observer.zadanie1;

public class Main {
    public static void main(String[] args) {

        SmsStation s = new SmsStation();
        s.addPhone(new Phone("1234"));
        s.addPhone(new Phone("2345"));
        s.addPhone(new Phone("3456"));

        s.sendSms("2345", "wyslana wiadomosc");
    }
}
