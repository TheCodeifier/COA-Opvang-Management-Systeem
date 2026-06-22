import java.util.List;

public class Municipality {

    private int id;
    private String name;
    private int residentsAmount;
    private int availablePlaces;
    private List<ASC> ascs;

    public Municipality(int id, String name, int residentsAmount, int availablePlaces, List<ASC> ascs) {
        this.id = id;
        this.name = name;
        this.residentsAmount = residentsAmount;
        this.availablePlaces = availablePlaces;
        this.ascs = ascs;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getResidentsAmount() { return residentsAmount; }
    public int getAvailablePlaces() { return availablePlaces; }
    public List<ASC> getAscs() { return ascs; }
}