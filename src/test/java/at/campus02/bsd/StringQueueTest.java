package at.campus02.bsd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

class StringQueueTest {

    private StringQueue queue;

    @BeforeEach
    void setup() {
        queue = new StringQueue(3);
    }

    @Test
    void testOfferAndPoll() {
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer("B"));
        assertTrue(queue.offer("C"));
        assertFalse(queue.offer("D"));

        assertEquals("A", queue.poll());
        assertEquals("B", queue.poll());
        assertEquals("C", queue.poll());
        assertNull(queue.poll());
    }

    @Test
    void testPeekAndElement() {
        assertNull(queue.peek());
        assertThrows(NoSuchElementException.class, () -> queue.element());

        queue.offer("Y");
        assertEquals("Y", queue.peek());
        assertEquals("Y", queue.element());
    }
}
