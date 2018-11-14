package kreacyjne.abstractFactory.zadanie3.dziekanat;

import kreacyjne.abstractFactory.zadanie3.aplikacja.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public abstract class ApplicationFactory {

    public static Application createApplication(Person person, String tresc) {
        return new Application(LocalDateTime.now(), "Gdañsk", person, tresc);
    }

    public static Application createConditionalApplication(Person person, List<Double> grades, String reason) {
        return new ConditionalStayApplication(LocalDateTime.now(), "Gdañsk", person, reason);
    }

    public static Application createSchoolarshipApplication(Person person, List<Double> grades, List<String> extracurricularActivities) {
        return new SchoolarshipApplication(LocalDateTime.now(), "Gdañsk", person, "Wygralem olimpiade", grades, extracurricularActivities);
    }

    public static Application createSemesterExtendApplication(Person person, String reason) {
        return new SemesterExtendApplication(LocalDateTime.now(), "Gdañsk", person, "Tresc wniosku", reason);
    }

    public static Application createSocialSchoolarshipApplication(Person person, List<Double> grades, double familyIncome) {
        return new SocialSchoolarshipApplication(LocalDateTime.now(), "Gdañsk", person, "Jestem z Zblewa", grades, familyIncome);
    }
}
