package at.campus02.bsd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SimpleDrinkTest {

    @Test
    void testGetVolume() {
        Liquid liquid = new Liquid("Water", 0.5, 0.0);
        SimpleDrink drink = new SimpleDrink("WaterDrink", liquid);
        assertEquals(0.5, drink.getVolume());
    }

    @Test
    void testGetAlcoholPercent() {
        Liquid liquid = new Liquid("Vodka", 0.7, 40.0);
        SimpleDrink drink = new SimpleDrink("VodkaDrink", liquid);
        assertEquals(40.0, drink.getAlcoholPercent());
    }

    @Test
    void testIsAlcoholicTrue() {
        Liquid alcoholicLiquid = new Liquid("Rum", 0.3, 20.0);
        SimpleDrink drink = new SimpleDrink("RumDrink", alcoholicLiquid);
        assertTrue(drink.isAlcoholic());
    }

    @Test
    void testIsAlcoholicFalse() {
        Liquid nonAlcoholicLiquid = new Liquid("Juice", 0.4, 0.0);
        SimpleDrink drink = new SimpleDrink("JuiceDrink", nonAlcoholicLiquid);
        assertFalse(drink.isAlcoholic());
    }
}
