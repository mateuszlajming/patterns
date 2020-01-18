package solution.builder;

public class Car {

    private final String make;
    private final String model;
    private final Color color;
    private final Transmission transmission;

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

    public static class Builder {
        private String make;
        private String model;
        private Color color;
        private Transmission transmission;

        public Builder make(String make) {
            this.make = make;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder color(Color color) {
            this.color = color;
            return this;
        }

        public Builder transmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.color = builder.color;
        this.transmission = builder.transmission;
    }

}