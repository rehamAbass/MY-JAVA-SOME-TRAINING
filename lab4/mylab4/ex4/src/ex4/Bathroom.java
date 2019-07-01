package ex4;

public class Bathroom extends Room{

	private int height;
	
	public Bathroom(int length ,int width ,int costPerMeter ,int height) {
		super(length, width, costPerMeter); // super must appear first line in constructor
		this.height =height;
	}
	
	public int getHeight() {return height;}
	
	public int WallsArea() {
		// there are two walls [width X height] 
		int areaFirstWalls = 2*( height * this.getWidth());
		
		//and there are two walls [length X height]
		int areaSecondWalls = 2*( height * this.getLength());
		
		return areaFirstWalls+areaSecondWalls;
	}
	
	@Override
	public int cost() {
		int costWalls = WallsArea() * super.getCostPerMeter();
		int costFloor = super.cost();
		return costWalls + costFloor;
	}
	
	// we assume that the bathroom next to the parents room , not included by it.
	@Override
	public String toString() {
		String s="\nbath  has :\n\t length = ";
		s+=this.getLength();
		s+= "\n\twidth =";
		s+=this.getWidth();
		s+= "\n\tHeight =";
		s+=this.getHeight();
		s+="\ncosts: ";
		s+=cost();
		return s;
	}
	
}
