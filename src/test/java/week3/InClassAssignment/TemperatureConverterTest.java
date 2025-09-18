package week3.InClassAssignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter tc = new TemperatureConverter();

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, tc.fahrenheitToCelsius(32));
        assertEquals(100, tc.fahrenheitToCelsius(212));
        assertEquals(-40, tc.fahrenheitToCelsius(-40));
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, tc.celsiusToFahrenheit(0));
        assertEquals(212, tc.celsiusToFahrenheit(100));
        assertEquals(-40, tc.celsiusToFahrenheit(-40));
    }

    @Test
    void testIsExtremeTemperature() {
        assertTrue(tc.isExtremeTemperature(-50));
        assertTrue(tc.isExtremeTemperature(60));
        assertFalse(tc.isExtremeTemperature(20));
        assertFalse(tc.isExtremeTemperature(-10));
    }

    @Test
    void testKelvinToCelsius() {
        assertEquals(0, tc.kevinToCelsius(273.15));
        assertEquals(100, tc.kevinToCelsius(373.15));
        assertEquals(-273.15, tc.kevinToCelsius(0), 0.01);
    }
}