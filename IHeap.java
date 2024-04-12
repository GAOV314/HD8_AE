/**
 * Represents a generic heap data structure.
 *
 * @author moises.alonso
 * @param <P> The type of the priority in the heap.
 * @param <V> The type of the value stored in the heap.
 */
public interface IHeap<P, V> {

    /**
     * Inserts a new element into the heap with the specified priority and value.
     *
     * @param priority The priority of the element to be inserted.
     * @param value The value to be inserted into the heap.
     */
    void Insert(P priority, V value);

    /**
     * Retrieves the top element of the heap.
     *
     * @return The top element of the heap.
     */
    V get();

    /**
     * Removes and retrieves the top element of the heap.
     *
     * @return The top element of the heap.
     */
    V remove();

    /**
     * Returns the number of elements in the heap.
     *
     * @return The number of elements in the heap.
     */
    int count();

    /**
     * Checks whether the heap is empty.
     *
     * @return true if the heap is empty, false otherwise.
     */
    boolean isEmpty();
}
