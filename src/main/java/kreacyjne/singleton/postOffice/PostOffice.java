package kreacyjne.singleton.postOffice;

public class PostOffice {
    private Website website = new Website();
    private Window window = new Window();
    private Automat automat = new Automat();

    public Ticket fromWebsite(){
        return website.getTicket();
    }
    public Ticket fromWindow(){
        return window.getTicket();
    }
    public Ticket fromAutomat(){
        return automat.getTicket();
    }
}
