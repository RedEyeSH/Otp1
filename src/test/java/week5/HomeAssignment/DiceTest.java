package week5.HomeAssignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void testRollValuesAreBetween1And6() {
        Dice dice = new Dice();
        for (int i = 0; i < 10; i++) {
            dice.roll();
            assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= 6,
                    "Die1 should be between 1 and 6");
            assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= 6,
                    "Die2 should be between 1 and 6");
        }
    }

    @Test
    public void testIsDoubleTrueWhenBothEqual() {
        Dice dice = new Dice();
        assertTrue(dice.isDouble(4, 4));
    }

    @Test
    public void testIsDoubleFalseWhenDifferent() {
        Dice dice = new Dice();
        assertFalse(dice.isDouble(2, 5));
    }
}
