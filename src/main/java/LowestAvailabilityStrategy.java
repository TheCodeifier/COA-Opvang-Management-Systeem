public class LowestAvailabilityStrategy implements PlacementStrategy {

    @Override
    public Municipality determineMunicipality(Refugee r) {
        return r.getPresentLocation() != null
                ? r.getPresentLocation()
                : null;
    }

    @Override
    public ASC determineASC(Municipality m) {
        if (m != null && !m.getAscs().isEmpty()) {
            return m.getAscs().get(0);
        }
        return null;
    }
}