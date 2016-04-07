public class Deque<T>{

    private LLNode<T> front, end;
    private int size;
    
    public Deque() {
		front = end = new LLNode<T>(null, null, null);
		front.setNext(end);
		end.setPrev(front);
        size = 0;
    }

    public boolean add(T e) {
        LLNode<T> temp = new LLNode(e, end, null);
        temp.setPrev(end.getPrev());
        end.getPrev().setNext(temp);
        size++;
        return true;
    }

    public void addFirst(T e) {
    	LLNode<T> temp = new LLNode(e, front.getNext(), front);
    	front.setNext(temp);
        size++;
    }

    public void addLast(T e) {
    	LLNode<T> temp = new LLNode(e, end, end.getPrev());
        end.getPrev().setNext(temp);
        end.setPrev(temp);
        size++;
    }

    public T getFirst() {
        return front.getNext().get();
    }

    public T getLast() {
        return end.getPrev().get();
    }

    public T removeFirst() {
        T temp = front.getNext().get();
        front.getNext().getNext().setPrev(front);
        front.setNext(front.getNext().getNext());
        return temp;
    }

    public T removeLast() {
        T temp = end.getPrev().get();
        end.getPrev().getPrev().setNext(end);
        end.setPrev(end.getPrev().getPrev());
        return temp;
    }
    
}
