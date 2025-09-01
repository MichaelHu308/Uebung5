package at.campus02.bsd;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class manages a queue of Drink objects
 * It provides methods to add (enqueue) and remove (dequeue) drinks in the order
 */
public class DrinkQueue {
    private Queue<Drink> queue;

    /**
     * Creates a new, empty DrinkQueue
     */
    public DrinkQueue() {
        this.queue = new LinkedList<>();
    }

    /**
     * Adds a Drink object to the end of the queue
     *
     * @param drink the Drink object to add
     */
    public void enqueue(Drink drink) {
        queue.offer(drink);
    }

    /**
     * Removes and returns the Drink object at the front of the queue
     *
     * @return the first Drink object in the queue, or null if the queue is empty
     */
    public Drink dequeue() {
        return queue.poll();
    }
}

