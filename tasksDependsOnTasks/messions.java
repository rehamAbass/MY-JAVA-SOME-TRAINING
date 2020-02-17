package jkk;

import java.util.ArrayList;
public class messions {

	private int n;
	private int arr[];
	private boolean mat[][];
	////////////////////////////////////
	public messions(int n) {
		this.n=n;
		this.arr =new int [n] ;///
		this.mat = new boolean [n][n]; //iniatedby false
	}
	//////////////////////////////////////////
	public void depends(int x , int y) {
		// x before y
		mat[x][y]=true;
	}
	////////////////////////////////////////////
	public void printTasks() {
		boolean isprinted[] = new boolean [n];
		boolean flag=false;
		int stage=1;
		ArrayList <Integer> list;
		while(stage <= n) {
			list = new ArrayList<>();  
			for(int i=0 ; i<n ; i++) 
			{ // on columns
				if(!isprinted[i])
				{
					for(int j=0 ; j<n ; j++)
					{ //on rows
						if(mat[j][i]== true && isprinted[j]==false) 
						{
							flag= true; break;
						}
					}
					if(flag == false) 
					{
						list.add(i); 
					}
					flag =false;
				}//is printed
			}

			System.out.println("stage  "+stage);
			for(Integer x:list) {
				isprinted[x]=true; 
				printTask(x);
			}
		System.out.println();
			stage ++;
		}//while
}
///////////////////////////////////////////////
	void printTask(int x) {
		//System.out.println(" "+x);
		System.out.println(" "+x);
	}
	
	//////////////////////////////////////////
	public static void main(String[] args) throws badInputException {
	
		String a[] = {"b","v","c","d"};
		tasks <String>s = new tasks<>(4,a);
		s.depends("b", "c");
		s.depends("c", "v");
		s.depends("b","v");
		/*
		s.depends(3,1);
		s.depends(3, 6);
		s.depends(4,6);
		s.depends(4, 5);
		s.depends(1,2);
		s.depends(5, 0);
		s.depends(6, 2);
		*/
		
		s.printTasks();
	}

}
