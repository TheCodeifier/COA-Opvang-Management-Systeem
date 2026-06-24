import java.util.ArrayList;
import java.util.List;

public class ReportService {

    private MunicipalityRepository municipalityRepository;

    public ReportService(MunicipalityRepository municipalityRepository) {
        this.municipalityRepository = municipalityRepository;
    }

    public List<String> generateMunicipalityReport() {
        List<String> result = new ArrayList<>();

        for (Municipality m : municipalityRepository.getAll()) {
            result.add(
                m.getName() + " - residents: " + m.getResidentsAmount()
            );
        }

        return result;
    }
}