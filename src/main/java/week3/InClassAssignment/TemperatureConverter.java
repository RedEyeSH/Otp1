package week3.InClassAssignment;

public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius *  9 / 5) + 32;
    }

    public boolean isExtremeTemperature(double temp) {
        return temp < -40 || temp > 50;
    }

    public double kevinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}

