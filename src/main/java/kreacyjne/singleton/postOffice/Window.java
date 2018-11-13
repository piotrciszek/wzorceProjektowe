package kreacyjne.singleton.postOffice;

public class Window {
    public Ticket getTicket(){
        int ticketNumber = TicketGenerator.INSTANCE.generateNumber();
        Ticket ticket = new Ticket(ticketNumber);
        ticket.setFromWho("Window");
        return ticket;
    }
}
