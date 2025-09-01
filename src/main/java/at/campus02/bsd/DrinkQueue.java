package at.campus02.bsd;

import java.util.LinkedList;
import java.util.Queue;

public class DrinkQueue {
    private Queue<Drink> queue;

    public DrinkQueue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(Drink drink) {
        queue.offer(drink);
    }

    public Drink dequeue() {
        return queue.poll();
    }
}
