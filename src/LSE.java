
public class LSE {
	public Node head = null;
	
	// problem 3 -> inset value A after node of value B
	public void insertAfterNode(int value, int info) {
		Node aux = this.head;
		
		while(aux != null) {
			if (aux.info == value) {
				Node node = new Node(info);
				node.next = aux.next;
				aux.next = node;
			}
			
			aux = aux.next;
		}
	}
	
	//problem 2 -> insert value A at position B
	public void insertAtPosition(int value, int position) {
		Node node = new Node(value);
		
		if (position < 0 || position > this.length()) return;
		
		if (this.head == null) {
			this.head = node;
		} else {
			if (position == 0) {
				node.next = head;
				head = node;
			} else {
				Node aux = this.head;
				
				for (int i = 0; i < position - 1; i++) {
					aux = aux.next;
				}
				
				node.next = aux.next;
				aux.next = node;
			}
		}
	}
	
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
