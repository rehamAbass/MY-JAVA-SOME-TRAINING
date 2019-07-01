package ex4;

public class Room {

	private int length ,width ,costPerMeter;
	
	public Room(int length ,int width ,int costPerMeter) {
		this.length =length;
		this.width =width;
		this.costPerMeter =costPerMeter;	
	}
	
	public int  getLength() {return this.length;}
	public int  getWidth() {return this.width;}	
	public int  getCostPerMeter() {return this.costPerMeter;}
	
	public int area() {
		return length*width;
	}
	
	public int cost() {
		return area()*costPerMeter;
	}
	
	@Override
	public String toString() {
		String s="\nroom has :\n\t length = ";
		s+=length;
		s+= "\n\twidth =";
		s+=width;
		s+="\ncosts: ";
		s+=cost();
		return s;
	}
}
