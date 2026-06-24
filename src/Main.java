import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Municipality Westerwolde = new Municipality(1, "Westerwolde", 25136, 100, new ArrayList<>());
        Municipality Zeist = new Municipality(2, "Zeist", 66656, 400, new ArrayList<>());

        List<Municipality> municipalities = new ArrayList<>();
        municipalities.add(Westerwolde);
        municipalities.add(Zeist);

        Country theNetherlands = new Country(1,"The Netherlands", municipalities);

        ASC asc1 = new ASC(1, "AZC Ter Apel");

        ASCEmployee ascEmployee = new ASCEmployee(1, "Josef Robbertsen", "Case Manager", asc1);
        COAEmployee coaEmployee = new COAEmployee(2, "Gwen Berkens", "Coördinator");

        File file = new File(1, "Initial case notes", new ArrayList<>());

        Refugee refugee = new Refugee(1, "Dariush Mehrdadian", LocalDate.of(1990, 5, 11), "Asylum seeker", file, null);

        PlacementStrategy strategy = new HighestAvailabilityStrategy();

        Municipality chosenMunicipality = strategy.determineMunicipality(refugee);

        if (chosenMunicipality == null) {
            chosenMunicipality = Zeist;
        }

        ASC chosenASC = strategy.determineASC(chosenMunicipality);

        if (chosenASC == null) {
            chosenASC = asc1;
        }

        Placement placement = new Placement(1, LocalDate.now(), "ACTIVE", chosenMunicipality, chosenASC);

        refugee = new Refugee(refugee.getId(), refugee.getName(), refugee.getDateOfBirth(), "PLACED", file, placement);

        FileRepository fileRepository = new FileRepository();
        FileService fileService = new FileService(fileRepository);
        fileService.addObserver(new LoggingObserver());
        fileService.addObserver(new NotificationBoxObserver());
        fileService.addObserver(new ReportObserver());

        MunicipalityRepository municipalityRepository = new MunicipalityRepository(municipalities);
        ReportService reportService = new ReportService(municipalityRepository);

        fileService.updateFile(refugee, "Refugee placed in " + chosenMunicipality.getName());

        List<String> report = reportService.generateMunicipalityReport();

        System.out.println("=== REFUGEE SYSTEM TEST ===");
        System.out.println("Refugee: " + refugee.getName());
        System.out.println("Status: " + refugee.getStatus());
        System.out.println("Municipality: " + placement.getMunicipality().getName());
        System.out.println("ASC assigned: " + placement.getAsc().getClass().getSimpleName());

        System.out.println("\n=== FILE NOTES ===");
        System.out.println(file.getNotes());

        System.out.println("\n=== MUNICIPALITY REPORT ===");
        for (String line : report) {
            System.out.println(line);
        }

        System.out.println("\n=== END OF TEST ===");
    }
}