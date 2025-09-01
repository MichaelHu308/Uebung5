package at.campus02.bsd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LiquidTest {

    @Test
    void testConstructorAndGetters() {
        Liquid liquid = new Liquid("Vodka", 0.7, 40.0);
        assertEquals("Vodka", liquid.getName());
        assertEquals(0.7, liquid.getVolume());
        assertEquals(40.0, liquid.getAlcoholPercent());
    }

    @Test
    void testSetName() {
        Liquid liquid = new Liquid("Juice", 0.3, 0);
        liquid.setName("Orange Juice");
        assertEquals("Orange Juice", liquid.getName());
    }

    @Test
    void testSetVolume() {
        Liquid liquid = new Liquid("Water", 1.0, 0);
        liquid.setVolume(1.5);
        assertEquals(1.5, liquid.getVolume());
    }

    @Test
    void testSetAlcoholPercent() {
        Liquid liquid = new Liquid("Rum", 0.5, 37.5);
        liquid.setAlcoholPercent(40.0);
        assertEquals(40.0, liquid.getAlcoholPercent());
    }
}
