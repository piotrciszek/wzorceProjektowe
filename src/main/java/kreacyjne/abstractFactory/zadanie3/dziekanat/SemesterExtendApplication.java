package kreacyjne.abstractFactory.zadanie3.dziekanat;

import java.time.LocalDate;

public class SemesterExtendApplication extends Application{
    private String reason;

    public SemesterExtendApplication(LocalDate dataUtworzenia, String miejsceUtworzenia, Person daneAplikanta, String tresc, String reason) {
        super(dataUtworzenia, miejsceUtworzenia, daneAplikanta, tresc);
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public SemesterExtendApplication setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
