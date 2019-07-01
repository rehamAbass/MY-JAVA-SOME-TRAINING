package List;


public class List {
	public static final int errorValue =-1000 ;
	private int count ;
	private Node Head ;
	private Node Tail;
	
/////////////////////////////////////
	public List() { // package
		this.count =0;
		this.Head =null;
		this.Tail = null;
	}
/////////////////////////////////////
	public int getCount() { return this.count;}
/////////////////////////////////////
	public void decreaseCount() {
		this.count --;
	}
/////////////////////////////////////
	public void setCount(int x) {
		this.count = x;
	}
//////////////////////////////////
	public void increaseCount() {
		this.count ++;
	}
/////////////////////////////////////
	public void addAtHead(int x) {
		Node node = new Node(x);
		if(this.getCount() == 0)
		{
			this.Head = node;
			this.Tail = node;
			this.increaseCount();
		}else { 	 // we have already Head , gonna add to his prev
			this.Head.setPrev(node); 
			node.setNext(this.Head);
			this.Head =node;
			this.increaseCount();
		}
	}
/////////////////////////////////////
	public void addAtTail(int val) {
		Node node = new Node(val);
		if(this.getCount() == 0) {
			this.Head = node;
			this.Tail = node;
			this.increaseCount();
			
		}else {		// we had Tail before
			this.Tail.setNext(node);
			node.setPrev(this.Tail);
			this.increaseCount();
			this.Tail = node;
		}
	}
/////////////////////////////////////
	public int deleteHead() {
		int val = 0;
		int count =this.getCount();
		if(count == 0) {
			System.out.println("Empty List, No Head to be deleted!");
			return errorValue;
		}
		if(count == 1){ // no new head to be.
			System.out.println("Head is also Tail , was deleted");
			this.setCount(0);
			val= this.Head.getVal();
			this.Head = null;
			this.Tail = null;
		}else { // pepare for the next head
			Node oldHead = this.Head;
			val = oldHead.getVal();
			oldHead.getNext().setPrev(null); // new head will has no previous node
			this.Head = oldHead.getNext(); // updating pointer to new head
			oldHead.setNext(null);// old head has no next
			this.decreaseCount(); // counter--
		}
		return val;
	}
	
/////////////////////////////////////
	public  int deleteTail() {
			int val = 0;
			int count =this.getCount();
			if(count == 0) {
				System.out.println("List is empty ,There is no Tail .");
				return errorValue;
			}
			if( count == 1){
				System.out.println("Tail is also Head , was deleted");
				this.setCount(0);
				val= this.Tail.getVal();
				this.Head = null;
				this.Tail = null;
			}else {
				Node oldTail = this.Tail;
				val = oldTail.getVal();
				oldTail.getPrev().setNext(null); // new tail will has no next node
				this.Tail= oldTail.getPrev(); // updating pointer to new tail
				oldTail.setPrev(null);// old tail will has no prev 
				this.decreaseCount(); // counter--
			}
			return val;  
	  }
	  
/////////////////////////////////////
	public int deleteAt(int index) { //countsuntil index , return it's value and delete it's node
		int i,val =0 ;
		int count =this.getCount();
		
		// deal with incorrect index:
		if(count == 0) {
			System.out.println("List is empty can't delete any thing!");
			return errorValue;
		}
		if( index < 0  || index >= count ) {
			System.out.println("Incorrect i, index must be positive and i < "+this.getCount());
			return errorValue;
		} 
		if( count == 1 && index != 0){
			System.out.println("Incorrect i,index should be 0 .");
			return errorValue;
		}
		// deal with correct indexes
		if(index == 0 ) {	
			return this.deleteHead();
		}
		if(index == (count -1) ) {	
			return this.deleteTail();
		}
		//getting to thisline means:  1 < index < count-1   
		 Node pNode =  this.Head;
		for( i = 1; i < index; i++) { //node is not head nor tail
			pNode = pNode.getNext();
		} 	
		//got pointer on the wanted Node, we can delete it :
		val = pNode.getVal();	//save it's value to be returned
		Node next ,prev;
		next = pNode.getNext(); 
		prev = pNode.getPrev();
		next.setPrev(prev);//set up the prevPOINTER of our next 
		prev.setNext(next);//set up the nextPointer of our prev
		pNode.setNext(null); // cut the pointer 
		pNode.setPrev(null); // cut the pointer
		this.decreaseCount(); // count --
		// Grabage Collector gonna free the node, we don't have to.
		return val;
	}
/////////////////////////////////////
	@Override
	public String toString() { 
		String res = "[";
		Node t;
		for (t = head; t != null; t = t.getNext()) {
			res += t.getVal();
			if (t.getNext() != null)
				res += ", ";
		}
		res += "]";
		return res;
	}
}
	/*
	public int deleteAtt(int i) {
		return delete(Head.get(i));
	}
	 */
	
	/////////////////////////////////

