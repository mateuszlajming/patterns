package solution.builder.lombok;

import lombok.Builder;
import lombok.Getter;
import solution.builder.Color;
import solution.builder.Transmission;

@Builder
@Getter
public class CarLombok {
    private String make;
    private String model;
    private Color color;
    private Transmission transmission;
}
