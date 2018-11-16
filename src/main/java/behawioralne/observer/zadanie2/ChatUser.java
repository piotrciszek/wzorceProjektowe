package behawioralne.observer.zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ChatUser implements Observer {
    private int id;
    private String nick;
    private List<String> messages = new ArrayList<>();
    private boolean isAdmin;

    public ChatUser(int id, String nick) {
        this.id = id;
        this.nick = nick;
        if (nick.equals("administrator") || nick.equals("admin")){
            this.isAdmin = true;
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String){
            String wiadomosc = (String) arg;
            messages.add(wiadomosc);
            System.out.println("Uzytkownik " + this.nick + " otrzymal wiadomosc: " + wiadomosc);
        }
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
