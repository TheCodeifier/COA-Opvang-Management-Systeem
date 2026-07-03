import java.util.List;

public class ReportService {

    private MunicipalityRepository municipalityRepository;

    public ReportService(MunicipalityRepository municipalityRepository) {
        this.municipalityRepository = municipalityRepository;
    }

    public List<String> generateMunicipalityReport() {
        return municipalityRepository.getAll();
    }
}