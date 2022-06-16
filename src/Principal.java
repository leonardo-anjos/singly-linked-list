
public class Principal {

	public Principal() {
		LSE list = new LSE();
		
		// problem 1
		list.insertAtEnd(87);
		list.insertAtEnd(3);
		list.insertAtEnd(55);
		list.insertAtEnd(7);
		
		list.recursivePrint(list.head);
		System.out.println();
		
		// problem 2
		list.insertAtPosition(23, 2);
		list.recursivePrint(list.head);
		System.out.println();
		
		// problem 3
		list.insertAfterNode(23, 0);
		list.recursivePrint(list.head);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Principal app = new Principal();
	}
}
