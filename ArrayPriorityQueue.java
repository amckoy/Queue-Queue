/*
Team Queue-Queue -- Ayman Ahmed, Adam McKoy, Anton Goretsky, Derek Lin
APCS2 pd5
HW#35 -- Privileged Status Gets You to the Front of the Line
2016-05-04
*/

import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {

    private ArrayList<Comparable> queue;
        
    public ArrayPriorityQueue() {
        queue = new ArrayList<Comparable>();
    }

    public void add(Object x) {
        queue.add(x);
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public Object peekMin() {
        //IM SORRY FOR DA TYPECASTING :(
        Object temp = (Comparable)(queue.get(0));
        for (int i = 1 ; i < queue.size() ; i++) {
            if (temp.compareTo(queue.get(i) > 0)) {
                //IM SORRY PT. 2
                temp = (Comparable)(queue.get(i));
            }
        }
        return temp;
    }

    public Object removeMin() {
        int index = 0;
        Object temp = (Comparable)(queue.get(0));
        for (int i = 1 ; i < queue.size() ; i++) {
            if (temp.compareTo(queue.get(i) > 0)) {
                //IM SORRY PT. 2
                temp = (Comparable)(queue.get(i));
                index = i;
            }
        }
        return queue.remove(index);
    }

    public static void main(String[] args) {
        ArrayPriorityQueue QUEUEQUEUE = new ArrayPriorityQueue();
        //all anton's problem now
    }
    
}
