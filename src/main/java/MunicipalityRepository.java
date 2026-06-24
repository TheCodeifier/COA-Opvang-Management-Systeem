import java.util.List;

public class MunicipalityRepository {

    private List<Municipality> municipalities;

    public MunicipalityRepository(List<Municipality> municipalities) {
        this.municipalities = municipalities;
    }

    public List<Municipality> getAll() {
        return municipalities;
    }
}