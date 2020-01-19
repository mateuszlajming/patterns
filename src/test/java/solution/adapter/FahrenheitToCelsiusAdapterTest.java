package solution.adapter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class )
public class FahrenheitToCelsiusAdapterTest {

    @Mock
    FahrenheitThermometer fahrenheitThermometer;

    @Test
    public void degreesFahrenheit32() {
        when(fahrenheitThermometer.getDegreesFahrenheit()).thenReturn(32d);

        var celsiusThermometer = new FahrenheitToCelsiusAdapter(fahrenheitThermometer);

        assertThat(celsiusThermometer.getDegreesCelsius()).isEqualTo(0d);
    }

    @Test
    public void degreesFahrenheit212() {
        when(fahrenheitThermometer.getDegreesFahrenheit()).thenReturn(212d);

        var celsiusThermometer = new FahrenheitToCelsiusAdapter(fahrenheitThermometer);

        assertThat(celsiusThermometer.getDegreesCelsius()).isEqualTo(100d);
    }

}