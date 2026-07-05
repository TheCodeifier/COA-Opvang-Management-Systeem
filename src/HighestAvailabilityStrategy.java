public class HighestAvailabilityStrategy implements PlacementStrategy {

    @Override
    public Municipality determineMunicipality(Refugee r) {
        return null;
    }

    @Override
    public ASC determineASC(Municipality m) {
        if (m != null && !m.getAscs().isEmpty()) {
            return m.getAscs().get(0);
        }
        return null;
    }
}