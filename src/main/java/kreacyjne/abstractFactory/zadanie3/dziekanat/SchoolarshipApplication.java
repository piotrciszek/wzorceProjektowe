package kreacyjne.abstractFactory.zadanie3.dziekanat;

import java.time.LocalDate;
import java.util.List;

public class SchoolarshipApplication extends Application{
    private List<Double> grades;
    private List<String> extracurricularActivities;

    public SchoolarshipApplication(LocalDate dataUtworzenia, String miejsceUtworzenia, Person daneAplikanta, String tresc, List<Double> grades, List<String> extracurricularActivities) {
        super(dataUtworzenia, miejsceUtworzenia, daneAplikanta, tresc);
        this.grades = grades;
        this.extracurricularActivities = extracurricularActivities;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public SchoolarshipApplication setGrades(List<Double> grades) {
        this.grades = grades;
        return this;
    }

    public List<String> getExtracurricularActivities() {
        return extracurricularActivities;
    }

    public SchoolarshipApplication setExtracurricularActivities(List<String> extracurricularActivities) {
        this.extracurricularActivities = extracurricularActivities;
        return this;
    }
}
