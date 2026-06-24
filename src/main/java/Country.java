import java.util.ArrayList;
import java.util.List;

public class Country {

    private int id;
    private String name;
    private List<Municipality> municipalities;

    public Country(int id, String name, List<Municipality> municipalities) {
        this.id = id;
        this.name = name;
        this.municipalities = municipalities;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Municipality> getMunicipalities() {
        return new ArrayList<>(municipalities);
    }
}