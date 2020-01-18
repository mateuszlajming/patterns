package solution.factorymethod;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PeopleFactoryTest {

    PeopleFactory peopleFactory = new PeopleFactory();

    @Test
    public void getVillager() {
        Person person = peopleFactory.getPerson(PersonType.RURAL);

        assertThat(person).isInstanceOf(Villager.class);
        assertThat(person.getName()).isEqualTo("Village Person");
    }

    @Test
    public void getCityPerson() {
        Person person = peopleFactory.getPerson(PersonType.URBAN);

        assertThat(person).isInstanceOf(CityPerson.class);
        assertThat(person.getName()).isEqualTo("City Person");
    }
}
