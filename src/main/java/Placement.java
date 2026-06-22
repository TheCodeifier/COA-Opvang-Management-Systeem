import java.time.LocalDate;

public class Placement {

    private int id;
    private LocalDate date;
    private String status;
    private Municipality municipality;
    private ASC asc;

    public Placement(int id, LocalDate date, String status, Municipality municipality, ASC asc) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.municipality = municipality;
        this.asc = asc;
    }

    public int getId() { return id; }
    public LocalDate getDate() { return date; }
    public String getStatus() { return status; }
    public Municipality getMunicipality() { return municipality; }
    public ASC getAsc() { return asc; }
}