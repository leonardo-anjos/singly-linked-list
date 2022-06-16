
public class Principal {

	public Principal() {
		LSE list = new LSE();
		
		list.insertAtEnd(81);
		list.insertAtEnd(3);
		list.insertAtEnd(55);
		list.insertAtEnd(7);
		
		list.recursivePrint(list.head);
		System.out.println();
		
//		list.insertAtEnd(0); 			// problem 1
//		list.insertAtPosition(23, 2); 	// problem 2
//		list.insertAfterNode(55, 10); 	// problem 3
		list.removeEndList();			// problem 4
//		list.removeAtPos(1);			// problem 5
//		list.removeAfterNode(10);		// problem 6
//		list.inverterNodes(3);			// problem 7
//		list.avgInfoList();				// problem 8
//		list.removeOcurrence();			// problem 9
//		list.reverseList();				// problem 10
		
		list.recursivePrint(list.head);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Principal app = new Principal();
	}
}
