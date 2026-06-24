import java.util.ArrayList;
import java.util.List;

public class CaseFile {

    private int id;
    private String notes;
    private List<String> statusHistory;

    public CaseFile(int id, String notes, List<String> statusHistory) {
        this.id = id;
        this.notes = notes;
        this.statusHistory = statusHistory;
    }

    public int getId() {
        return id;
    }

    public String getNotes() {
        return notes;
    }

    public List<String> getStatusHistory() {
        return new ArrayList<>(statusHistory);
    }
}