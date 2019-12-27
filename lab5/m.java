// Polymorpheism
public class m{
	///////////////////////////////////////////
	public static int sum(Func func) {
		int s=0;
		for(int i=0 ; i<Func.upper; i++) {
			s+=func.f(i,0);
		}
		return s;
	}
///////////////////////////////////////////////
	public static void main(String[] args) {
		System.out.println(m.sum(new ab()));
	}
///////////////////////////////////////////////////////
	
}
