package kreacyjne.abstractFactory.zadanie3.dziekanat;

import kreacyjne.abstractFactory.zadanie3.aplikacja.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class SocialSchoolarshipApplication extends Application{

    private List<Double> grades;
    private double totalFamilyIncome;

    public SocialSchoolarshipApplication(LocalDateTime dataUtworzenia, String miejsceUtworzenia, Person daneAplikanta, String tresc, List<Double> grades, double totalFamilyIncome) {
        super(dataUtworzenia, miejsceUtworzenia, daneAplikanta, tresc);
        this.grades = grades;
        this.totalFamilyIncome = totalFamilyIncome;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public SocialSchoolarshipApplication setGrades(List<Double> grades) {
        this.grades = grades;
        return this;
    }

    public double getTotalFamilyIncome() {
        return totalFamilyIncome;
    }

    public SocialSchoolarshipApplication setTotalFamilyIncome(double totalFamilyIncome) {
        this.totalFamilyIncome = totalFamilyIncome;
        return this;
    }
}
