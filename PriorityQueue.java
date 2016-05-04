public interface PriorityQueue{

    void add( Object x ); //Adds an item to this priority queue.
    boolean isEmpty( ); //Returns true if this stack is empty, otherwise returns false.
    object peekMin( ); //Returns the smallest item stored in this priority queue without removing it.
    object removeMin( ); //Removes and returns the smallest item stored in this priority queue.

}
