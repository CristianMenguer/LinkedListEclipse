
public class MyLinkedList {

	private Node first;
	private Node last;
	private int size;
	
	public MyLinkedList() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public void addFirst(Node newElement) {
		if(size == 0) {
			last = newElement;
		} else if (size > 0) {
			first.setPrevious(newElement);
		}
		newElement.setNext(first);
		first = newElement;
		size++;
	}
	
	public void addLast(Node newElement) {
		if(size == 0) {
			first = newElement;
		}
		last.setNext(newElement);
		newElement.setPrevious(last);
		last = newElement;
		size++;
	}
	
	public Node removeFirst() {
		if(size == 0) {
			return null;
		}
		if (size == 1) {
			last = null;
		}
		Node toReturn = first;
		first = first.getNext();
		
		
		if (first != null)
			first.setPrevious(null);

		size--;
		
		return toReturn;
	}
	
	public Node findElementByPosition(int position) {
		if(size == 0 || position >= size) {
			return null;
		}
		Node current = first;
		int counter = 0;
		while(counter < position) {
			current = current.getNext();
			counter++;
		}
		return current;
	}
	
	public Node removeLast() {
		
		Node toReturn = last;
		if(size == 0) {
			return toReturn;
		}
		if(size == 1) {
			first = null;
			last = null;
			size--;
			return toReturn;
		}
		
		Node secondLast = last.getPrevious();
		secondLast.setNext(null);
		last = secondLast;
		size--;	
		return toReturn;
		
	}
	
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public String toString() {
		
		String toReturn = "[ ";
		Node current = first;
		while(current != null) {
			toReturn += current.toString() + " ";
			current = current.getNext();
		}
		toReturn += "]";
		return toReturn;		
		
	}
	
	
}
