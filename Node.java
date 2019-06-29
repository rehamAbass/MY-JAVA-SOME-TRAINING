package List;

public class Node {

	private int val;
	private Node next;
	private Node prev;
	
	 Node(int val) {
		this.val =val;
		next = null;
		prev = null;
	}
	
	void setVal(int x) { 	//package
		this.val = x;
	}
	int getVal() { 			// package
		return this.val;
	}
	 Node getNext() {
		return next;
	}
	Node getPrev() {
		return prev;
	}
	 void setNext(Node next) {
		this.next = next;
	}
	 void setPrev(Node prev) {
		this.prev = prev;
	}
	 
	 Node get(int i) {
			if (i == 0)
				return this;
			if (next == null)
				return null;
			return next.get(i-1);
		}
}
