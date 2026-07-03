import java.time.LocalDate;

public class Refugee {

    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String status;
    private File file;
    private Placement presentLocation;

    public Refugee(int id, String name, LocalDate dateOfBirth, String status,
                   File file, Placement presentLocation) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
        this.file = file;
        this.presentLocation = presentLocation;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public String getStatus() { return status; }
    public File getFile() { return file; }
    public Placement getPresentLocation() { return presentLocation; }
}