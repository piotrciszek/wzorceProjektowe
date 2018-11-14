package kreacyjne.abstractFactory.zadanie3.aplikacja;

import kreacyjne.abstractFactory.zadanie3.dziekanat.ApplicationFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj numer indeksu");
        String index = scanner.nextLine();

        Person student = new Person(imie, nazwisko, index);

        boolean isWorking = true;
        while (isWorking){
            String command = scanner.nextLine();

            if (command.equals("stay")){
                conditionalStay(scanner, student);

            } else {
                break;
            }
        }
    }
    private static void conditionalStay(Scanner scanner, Person student) {
        System.out.println("Give me grades separated by commas (ex. '1,2,3,4,5')");
        String[] gradesStrings = scanner.nextLine().toLowerCase().trim().split(",");
        List<Double> grades = new ArrayList<>();

        for (String grade : gradesStrings) {
            grades.add(Double.parseDouble(grade));
        }

        System.out.println("Give me a reason:");
        String reason = scanner.nextLine();

        System.out.println(
                ApplicationFactory.createConditionalApplication(
                        student,
                        grades,
                        reason));
    }
}
