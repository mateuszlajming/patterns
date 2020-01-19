package solution.flyweight;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @Test
    public void same() {
        var a = "Ala";
        var b = "Ala";
        assertThat(a).isSameAs(b);
    }

    @Test
    public void notSame() {
        var a = "Ala";
        var b = new String("Ala");
        assertThat(a).isNotSameAs(b);
    }

    @Test
    public void sameAgain() {
        var a = "Ala";
        var b = new String("Ala").intern();
        assertThat(a).isSameAs(b);
    }
}
