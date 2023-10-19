package be.vdab.gastenboek;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GastenboekEntry implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final DateTimeFormatter FORMATTER =  DateTimeFormatter.ofPattern ("dd/MM/yyyy" + " H:m:s");

    private LocalDateTime datum;
    private String schrijver;
    private String boodschap;

    public GastenboekEntry(String schrijver, String boodschap) {
        this.datum = LocalDateTime.now();
        this.schrijver = schrijver;
        this.boodschap = boodschap;
    }

    private String getDatum() {
        return datum.format(FORMATTER);
    }

    public String getSchrijver() {
        return schrijver;
    }

    public String getBoodschap() {
        return boodschap;
    }

    @Override
    public String toString() {
        return  getDatum() + " ; "+ schrijver + " ; " +  boodschap;
    }
}
