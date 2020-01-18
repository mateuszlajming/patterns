package solution.builder;

public class Car1 {

    private final String make;
    private final String model;
    private final Color color;
    private final Transmission transmission;

    public Car1(String make, String model, Color color, Transmission transmission) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.transmission = transmission;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}