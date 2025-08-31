package at.campus02.bsd;

/**
 * Interface representing a basic queue of strings
 * Provides methods to add, remove and inspect elements
 */
public interface IQueue {

  /**
   * Inserts the specified element into this queue if possible
   *
   * @param obj the string element to add to the queue
   */
  public abstract boolean offer(String obj);

  /**
   * Retrieves and removes the head of this queue, or returns null
   * if this queue is empty
   */
  public abstract String poll();

  /**
   * Retrieves and removes the head of this queue
   *
   * @return the head of this queue
   * @throws java.util.NoSuchElementException if this queue is empty
   */
  public abstract String remove();

  /**
   * Retrieves, but does not remove, the head of this queue,
   * or returns null if this queue is empty
   */
  public abstract String peek();

  /**
   * Retrieves, but does not remove, the head of this queue
   *
   * @return the head of this queue
   * @throws java.util.NoSuchElementException if this queue is empty
   */
  public abstract String element();
}
