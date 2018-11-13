package kreacyjne.singleton.postOffice;

public enum TicketGenerator {
    INSTANCE;

    private int ticketNumber = 0;
    public int generateNumber() {
        return ticketNumber++;
    }
}
