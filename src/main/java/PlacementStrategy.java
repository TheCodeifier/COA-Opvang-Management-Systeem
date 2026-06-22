public interface PlacementStrategy {

    Municipality determineMunicipality(Refugee r);

    ASC determineASC(Municipality m);
}