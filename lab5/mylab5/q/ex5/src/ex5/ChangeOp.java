package ex5;

public class ChangeOp extends StringOp{

	private char from , to;
	
	public ChangeOp(char c1, char c2) {
		this.from = c1;
		this.to = c2;
	}

	@Override
	public String f(String str) {
		return str.replace(from, to);
	}

}
