
public class LSE {
	public Node head = null;

	// problem 10 -> reverse list
	public void reverseList() {
		
	}
	
	// problem 9 -> remove all occurences from list
	public void removeOcurrence() {
		
	}
	
	// problem 8 -> avg from list
	public void avgInfoList() {
		Node aux = this.head;
		int totalSum = 0;
		int avg = 0;
		
		if (this.length() == 0) {
			totalSum = aux.info;
			avg = totalSum;
		} else {			
			while (aux != null) {
				aux = aux.next;
				
				if (aux != null) totalSum = totalSum + aux.info;
			}
		}
		
		avg = totalSum / this.length();
		System.out.println(avg);
	}
	
	// problem 7 -> inverter node i with i + 1
	public void inverterNodes(int position) {
		
	}
	
	// problem 6 -> remove value before node
	public void removeAfterNode(int value) {
		Node aux = this.head;
		
		while(aux != null) {
			if (aux.info == value && aux.next != null) {
				aux.next = aux.next.next;
			}
			aux = aux.next;
		}
	}
	
	
	// problem 5 -> remove value from position
	public void removeAtPos(int position) {
		Node aux = this.head;
		
		if (this.head == null || position < 0 || position > this.length()) return;
		
		if (position == 0) {
			this.head = this.head.next;
		}
		
		for (int i = 0; i < position -1; i++) {
			aux = aux.next;
		}
		
		aux.next = aux.next.next;
	}
	
	//prolem 4 -> remove value from end list
	public void removeEndList() {
		Node aux = this.head;
		
		for (int i = 0; i < this.length() - 1; i++) {
			aux = aux.next;
			
			if (aux.next == null) aux = aux;
		}
	}
	
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
