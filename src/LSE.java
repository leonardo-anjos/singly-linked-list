
public class LSE {
	public Node head = null;
	
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
