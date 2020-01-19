package solution.adapter;

public class FahrenheitToCelsiusAdapter implements CelsiusThermometer {

    private FahrenheitThermometer fahrenheitThermometer;

    public FahrenheitToCelsiusAdapter(FahrenheitThermometer fahrenheitThermometer) {
        this.fahrenheitThermometer = fahrenheitThermometer;
    }

    public double getDegreesCelsius() {
        return (fahrenheitThermometer.getDegreesFahrenheit()-32)*5/9;
    }
}
