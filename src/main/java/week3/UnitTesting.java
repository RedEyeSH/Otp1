package week3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTesting {
    @Test
    void testBSo() {
        assertEquals(4, Degree.getDegree("bsc"));
    }

    @Test
    void testMSc() {
        assertEquals(6, Degree.getDegree("msc"));
    }

    @Test
    void testPhD() {
        assertEquals(3, Degree.getDegree("phd"));
    }
}
