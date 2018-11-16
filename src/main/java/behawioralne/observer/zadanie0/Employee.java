package behawioralne.observer.zadanie0;

import java.util.Observer;

public class Employee implements Observer {
    private static int counter = 0;

    private int id = counter++;

    public Employee() {
    }

    @Override
    public void update(java.util.Observable o, Object arg) {

        if (arg instanceof String) {
            String castedNews = (String) arg;

            System.out.println(id + " powiadomiony o " + castedNews);

        }
    }
}
