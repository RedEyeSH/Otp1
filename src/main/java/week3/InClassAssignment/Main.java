package week3.InClassAssignment;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double tempC = converter.fahrenheitToCelsius(98.6);
        double tempF = converter.celsiusToFahrenheit(37);

        System.out.println("98.6°F to Celsius: " + tempC);
        System.out.println("37°C to Fahrenheit: " + tempF);
        System.out.println("Is 100°C extreme? " + converter.isExtremeTemperature(100));
        System.out.println("300K to Celsius: " + converter.kevinToCelsius(300));
    }
}
