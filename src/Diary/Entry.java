package Diary;
import  java.time.LocalDate;

public class Entry {
    private String tittle;
    private String body;
    private final LocalDate date = LocalDate.now();
    private String iD;


    public Entry(String tittle, String body, String iD) {
        this.tittle = tittle;
        this.body = body;
        this.iD = iD;
    }


    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getDate() {

        return date;
    }

    public String getiD() {
        return iD;
    }


    public final LocalDate getdate() {
        return date;
    }

    @Override
    public String toString() {
        return String.format("""
                tittle: %s
                body: %s
                date: %s
                iD: %s
                """, getTittle(), getBody(), getDate(), getiD());
    }
}
