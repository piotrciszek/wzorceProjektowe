package behawioralne.observer.zadanie2;

public class Main {
    public static void main(String[] args) {
        ChartRoom room = new ChartRoom();
        room.userLogin("Adam");
        room.userLogin("Jan");
        room.userLogin("admin");

        room.sendMessage(1, "wiadomosc do adama");
    }
}
