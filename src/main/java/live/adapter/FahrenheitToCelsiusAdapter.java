package live.adapter;

interface FahrenheitThermometer {
    double getDegreesFahrenheit();
}

interface CelsiusThermometer {
    double getDegreesCelsius();
}

public class FahrenheitToCelsiusAdapter implements CelsiusThermometer {
    private FahrenheitThermometer fahrenheitThermometer;

    public FahrenheitToCelsiusAdapter(FahrenheitThermometer fahrenheitThermometer) {
        this.fahrenheitThermometer = fahrenheitThermometer;
    }

    @Override
    public double getDegreesCelsius() {
        return (fahrenheitThermometer.getDegreesFahrenheit() - 32) * 5 / 9;
    }
}
