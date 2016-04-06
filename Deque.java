public class Deque<T>{

    private LLNode<T> front, end;

    public Deque() {
		front = end = new LLNode<T>(null, null, null);
		front.setNext(end);
		end.setPrev(front);
    }

    public boolean add(T e) {
        LLNode<T> temp = new LLNode(e, end, null);
        temp.setPrev(end.getPrev());
        end.getPrev().setNext(temp);
        return true;
    }

    public void addFirst(T e) {
    	LLNode<T> temp = new LLNode(e, front.getNext(), front);
    	front.setNext(temp);
    }

    public void addLast(T e) {
    	LLNode<T> temp = new LLNode(e, end, end.getPrev());
  		
    }

}
