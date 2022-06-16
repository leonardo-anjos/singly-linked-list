
public class LSE {
	public Node head = null;
	
	// problem 1 -> insert value at the end of list
	public void insertAtEnd(int value) {
		Node node = new Node(value);
		
		if (this.head == null) {
			this.head = node;
		} else {
			Node aux = this.head;
			
			while(aux.next != null) {
				aux = aux.next;
			}
			
			aux.next = node;
		}
	}
	
	public int length() {
		int count = 0;
		Node aux = this.head;
		
		while(aux != null) {
			aux = aux.next;
			count++;
		}
		return count;
	}
	
	public void interativePrint() {
		Node aux = this.head;
		
		while(aux != null) {
			System.out.print(aux.info + "-");
			aux = aux.next;
		}
	}
	
	public void recursivePrint(Node auxHead) {
		if(auxHead == null) return;
		
		Node aux = auxHead;
		System.out.print(aux.info + "-");
		recursivePrint(aux.next);
	}
}
