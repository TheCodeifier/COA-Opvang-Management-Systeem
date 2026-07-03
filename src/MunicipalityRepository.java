import java.util.ArrayList;
import java.util.List;

public class MunicipalityRepository {

    private List<Municipality> municipalities;

    public MunicipalityRepository(List<Municipality> municipalities) {
        this.municipalities = municipalities;
    }

    public List<String> getAll() {
        List<String> result = new ArrayList<>();
        for (Municipality m : municipalities) {
            result.add(m.getName());
        }
        return result;
    }
}