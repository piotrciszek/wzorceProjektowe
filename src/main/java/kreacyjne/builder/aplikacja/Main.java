package kreacyjne.builder.aplikacja;

public class Main {

    public static void main(String[] args) {
        MailServer server = new MailServer();
        server.connect(new Client("Marian"));
        server.connect(new Client("Michau"));
        server.connect(new Client("Piotrek"));
        server.connect(new Client("Władek"));

        server.sendMessage(new Mail.Builder().setTresc("daas").createMail(),new Client("Andrzej"));
        
    }
}