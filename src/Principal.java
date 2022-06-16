
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
		list.insertAfterNode(23, 10);
		list.recursivePrint(list.head);
		System.out.println();
		
		// problem 4
		list.removeEndList();
		
		// problem 5
		list.removeAtPos(1);
		list.recursivePrint(list.head);
		System.out.println();
		
		// problem 6
		list.removeAfterNode(10);
		list.recursivePrint(list.head);
		System.out.println();
		
		// problem 7
		list.inverterNodes(3);
		
		// problem 8
		list.avgInfoList();
		System.out.println();
		
		// problem 9
		list.removeOcurrence();
		
		// problem 10
		list.reverseList();
	}
	
	public static void main(String[] args) {
		Principal app = new Principal();
	}
}
