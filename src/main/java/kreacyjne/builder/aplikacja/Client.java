package kreacyjne.builder.aplikacja;

import java.util.ArrayList;
import java.util.List;

public class Client {
    String name;
    List<Mail> mailList = new ArrayList<>();

    public Client(String name) {
        this.name = name;
    }

    public void readMail(Mail m){
        mailList.add(m);
        System.out.println("Klient " + this.name + " otrzymal maila");
    }

}
