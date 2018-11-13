package kreacyjne.builder.aplikacja;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MailServer {
    List<Client> connectedList = new ArrayList<>();

    public void connect(Client client){
        connectedList.add(client);
    }
    public void disconnect(Client client){
        connectedList.remove(client);
    }
    public void sendMessage(Mail mail, Client sender){
        for (Client z : connectedList){
            if (!z.equals(sender)){
                mail.setDataOdbioru(LocalDate.now());
                z.readMail(mail);
            }
        }
    }

}
