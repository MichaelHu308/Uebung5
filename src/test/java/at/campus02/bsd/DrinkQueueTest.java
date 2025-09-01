package at.campus02.bsd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DrinkQueueTest {

    static class TestDrink extends Drink {
        public TestDrink(String name) {
            super(name);
        }

        @Override
        public double getVolume() {
            return 1.0;
        }

        @Override
        public double getAlcoholPercent() {
            return 0;
        }

        @Override
        public boolean isAlcoholic() {
            return false;
        }
    }

    private DrinkQueue queue;

    @BeforeEach
    void setUp() {
        queue = new DrinkQueue();
    }

    @Test
    void testEnqueueAndDequeue() {
        Drink drink1 = new TestDrink("Drink1");
        Drink drink2 = new TestDrink("Drink2");

        queue.enqueue(drink1);
        queue.enqueue(drink2);

        Drink firstOut = queue.dequeue();
        assertEquals("Drink1", firstOut.getName());

        Drink secondOut = queue.dequeue();
        assertEquals("Drink2", secondOut.getName());

        assertNull(queue.dequeue());
    }

    @Test
    void testDequeueEmptyQueue() {
        assertNull(queue.dequeue());
    }
}
