
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("Amilcar");
		Person p2 = new Person("Alice");
		Person p3 = new Person("John");
		Person p4 = new Person("Pocahontas");
		
		Node n1 = new Node(p1);
		Node n2 = new Node(p2);
		Node n3 = new Node(p3);
		Node n4 = new Node(p4);
		
		MyLinkedList ll = new MyLinkedList();
		ll.addFirst(n1);
		ll.addFirst(n2);
		ll.addLast(n4);
		ll.addLast(n3);
		
		System.out.println(ll);
		
		ll.removeFirst();
		System.out.println(ll.findElementByPosition(0).getPrevious());
		
		ll.removeFirst();
		System.out.println(ll);
		
		ll.removeFirst();
		System.out.println(ll);
		
		ll.removeFirst();
		System.out.println(ll);
		
		
//		System.out.println("\nA");
//		System.out.println(ll);
//
//		System.out.println(ll.findElementByPosition(0));
//		System.out.println(ll.findElementByPosition(0).getNext());
//		System.out.println(ll.findElementByPosition(0).getNext().getNext());
//		System.out.println(ll.findElementByPosition(0).getNext().getNext().getNext());
//		System.out.println(ll.findElementByPosition(0).getNext().getNext().getNext().getNext());
//		
//		System.out.println("\nB");
//		System.out.println(ll);
//
//		System.out.println(ll.findElementByPosition(ll.size() - 1));
//		System.out.println(ll.findElementByPosition(ll.size() - 1).getPrevious());
//		System.out.println(ll.findElementByPosition(ll.size() - 1).getPrevious().getPrevious());
//		System.out.println(ll.findElementByPosition(ll.size() - 1).getPrevious().getPrevious().getPrevious());
//		System.out.println(ll.findElementByPosition(ll.size() - 1).getPrevious().getPrevious().getPrevious().getPrevious());
//		
//		System.out.println("\nC");
//		System.out.println(ll);
//
//		System.out.println(ll.findElementByPosition(2));
//		System.out.println(ll.findElementByPosition(2).getPrevious());
//		System.out.println(ll.findElementByPosition(2).getPrevious().getPrevious());
//		System.out.println(ll.findElementByPosition(2).getPrevious().getPrevious().getPrevious());
//		
//		System.out.println("\nD");
//		System.out.println(ll);
//
//		System.out.println(ll.findElementByPosition(3));
//		System.out.println(ll.findElementByPosition(3).getPrevious());
//		System.out.println(ll.findElementByPosition(3).getPrevious().getPrevious());
//		System.out.println(ll.findElementByPosition(3).getPrevious().getPrevious().getNext().getNext());
//
//		ll.removeFirst();
//		ll.removeFirst();
//		ll.addFirst(new Node(new Person("Cristian")));
//		ll.addLast(new Node(new Person("Rafael")));
//
//		System.out.println("\nE");
//		System.out.println(ll);
//
//		System.out.println(ll.findElementByPosition(0));
//		System.out.println(ll.findElementByPosition(0).getNext());
//		System.out.println(ll.findElementByPosition(0).getNext().getNext());
//		System.out.println(ll.findElementByPosition(0).getNext().getNext().getNext());
//
//		System.out.println("\nF");
//		System.out.println(ll);
//
//		System.out.println(ll.findElementByPosition(3));
//		System.out.println(ll.findElementByPosition(3).getPrevious());
//		System.out.println(ll.findElementByPosition(3).getPrevious().getPrevious());
//		System.out.println(ll.findElementByPosition(3).getPrevious().getPrevious().getPrevious());
//		System.out.println(ll.findElementByPosition(3).getPrevious().getPrevious().getPrevious().getPrevious());
//
//		System.out.println("\nG");
//		System.out.println(ll);
//
//		ll.removeFirst();
//		ll.removeFirst();
//		ll.removeFirst();
//
//		System.out.println("\nG");
//		System.out.println(ll);
//		System.out.println(ll.findElementByPosition(0));
//		System.out.println(ll.findElementByPosition(0).getNext());
//		System.out.println(ll.findElementByPosition(0).getPrevious());
//		
//		System.out.println("\nI");
//
//		System.out.println(ll);		
//		ll.removeFirst();
//
//		System.out.println("\nJ");
//		System.out.println(ll);
//		System.out.println(ll.findElementByPosition(0));

		
		
		
	}

}
