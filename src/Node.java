
public class Node {

	private Person element;
	private Node next;
	private Node previous;
	
	public Node(Person element) {
		this.element = element;
		this.next = null;
		this.previous = null;
	}

	public Person getElement() {
		return element;
	}

	public void setElement(Person element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	@Override 
	public String toString() {
		return this.element.toString();
	}
	
}
