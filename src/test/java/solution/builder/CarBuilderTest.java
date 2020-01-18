package solution.builder;

import org.junit.Test;
import solution.builder.lombok.CarLombok;

import static org.assertj.core.api.Assertions.assertThat;

public class CarBuilderTest {

    @Test
    public void noBuilder() {
        Car1 car = new Car1("Honda", "Civic", Color.RED, Transmission.MANUAL);

        assertThat(car.getMake()).isEqualTo("Honda");
        assertThat(car.getModel()).isEqualTo("Civic");
        assertThat(car.getColor()).isEqualTo(Color.RED);
        assertThat(car.getTransmission()).isEqualTo(Transmission.MANUAL);
    }

    @Test
    public void joshuaBlochBuilder() {
        Car car = new Car.Builder()
            .make("Honda")
            .model("Civic")
            .color(Color.RED)
            .transmission(Transmission.MANUAL)
            .build();

        assertThat(car.getMake()).isEqualTo("Honda");
        assertThat(car.getModel()).isEqualTo("Civic");
        assertThat(car.getColor()).isEqualTo(Color.RED);
        assertThat(car.getTransmission()).isEqualTo(Transmission.MANUAL);
    }

    @Test
    public void lombokBuilder() {
        CarLombok car = CarLombok.builder()
            .make("Honda")
            .model("Civic")
            .color(Color.RED)
            .transmission(Transmission.MANUAL)
            .build();

        assertThat(car.getMake()).isEqualTo("Honda");
        assertThat(car.getModel()).isEqualTo("Civic");
        assertThat(car.getColor()).isEqualTo(Color.RED);
        assertThat(car.getTransmission()).isEqualTo(Transmission.MANUAL);
    }
}
