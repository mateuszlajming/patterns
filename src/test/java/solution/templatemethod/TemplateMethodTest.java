package solution.templatemethod;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TemplateMethodTest {

    @Test
    public void policeman() {
        Person person = new Policeman();
        assertThat(person.dayRoutine()).isEqualTo("Wake up, Prevent crime, Go to sleep");
    }

    @Test
    public void chief() {
        Person person = new Chief();
        assertThat(person.dayRoutine()).isEqualTo("Wake up, Prepare food, Go to sleep");
    }
}
