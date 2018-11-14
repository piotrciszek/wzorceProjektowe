package kreacyjne.abstractFactory.zadanie3.dziekanat;

import kreacyjne.abstractFactory.zadanie3.aplikacja.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class ConditionalStayApplication extends Application {
    private List<Double> grades;
    private String reason;

    public ConditionalStayApplication(LocalDateTime dataUtworzenia, String miejsceUtworzenia, Person daneAplikanta, String tresc, List<Double> grades, String reason) {
        super(dataUtworzenia, miejsceUtworzenia, daneAplikanta, tresc);
        this.grades = grades;
        this.reason = reason;
    }

    public ConditionalStayApplication(LocalDateTime dataUtworzenia, String miejsceUtworzenia, Person daneAplikanta, String tresc) {
        super(dataUtworzenia, miejsceUtworzenia, daneAplikanta, tresc);
    }

    public List<Double> getGrades() {
        return grades;
    }

    public ConditionalStayApplication setGrades(List<Double> grades) {
        this.grades = grades;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public ConditionalStayApplication setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
