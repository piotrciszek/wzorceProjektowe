package kreacyjne.singleton.postOffice;

public class Website {
    public Ticket getTicket(){
        int ticketNumber = TicketGenerator.INSTANCE.generateNumber();
        Ticket ticket = new Ticket(ticketNumber);
        ticket.setFromWho("Website");
        return ticket;
    }
}
