package jkk;


public class tasks <V>extends messions{

	private V arr[];
	private int n;
	public tasks(int n ,V brr[]) {
		super(n);
		this.n=n;
		arr = brr;
	}
	///////////////////////////////////////////////////////////////
	public void depends(V t1 , V t2) throws badInputException{
		int index1=-1, index2=-1;
		for(int i=0; i<n;i++) {
			if(arr[i]== t1 ) index1 =i;
			if(arr[i]== t2 ) index2 =i;
		}
		if(index1 ==-1 || index2 == -1)
			throw new badInputException();
		super.depends(index1, index2);
	}
	//////////////////////////////////////////////////////////////////
	public void printTasks() {
		super.printTasks();
	}
	////////////////////////////////////////////////////////////
	@Override
	public void printTask(int x) {
		System.out.println(arr[x].toString());
	}
	////////////////////////////////////////////////////////
}
