package behawioralne.observer.zadanie0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        McDonald mcd = new McDonald();

        Scanner sc = new Scanner(System.in);
        while(true){
            String line = sc.nextLine();
            mcd.handleOrder(line);
            if(line.equals("quit"))
                break;
        }
    }
}
