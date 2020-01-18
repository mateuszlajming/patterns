package solution.factorymethod;

public class PeopleFactory {
    public Person getPerson(PersonType type) {
        switch (type) {
            case RURAL: return new Villager();
            case URBAN: return new CityPerson();
            default: throw new java.lang.IllegalArgumentException();
        }
    }
}
