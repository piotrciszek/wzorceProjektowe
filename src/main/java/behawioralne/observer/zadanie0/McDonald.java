package behawioralne.observer.zadanie0;

import java.util.Observable;

public class McDonald extends Observable {

    public McDonald() {
        for(int i=0; i < 10; i++){
            Employee e = new Employee();
            addObserver(e); // dodajemy observera
        }
    }

    public void handleOrder(String order){
        setChanged();               // zaznaczamy zmianę
        notifyObservers(order);     // informujemy o zmianie i wiadomości
        // którą chcemy przekazać do observerów
    }
}