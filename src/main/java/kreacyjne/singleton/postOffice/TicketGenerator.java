package kreacyjne.singleton.postOffice;

public enum TicketGenerator {
    INSTANCE;

    private int ticketNumber = 0;
    public int generateNumber() {
        System.out.println("Pobrano ticket" + ticketNumber);
        return ticketNumber++;
    }
}
