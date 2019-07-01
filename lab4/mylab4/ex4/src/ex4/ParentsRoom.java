package ex4;

public class ParentsRoom extends Room{
	Bathroom bRoom;
	public ParentsRoom(int length ,int width ,int lengthB,int widthB,int heightB,int costPerMeter) {
		super(length ,width ,costPerMeter); 
		bRoom = new Bathroom(lengthB,widthB,costPerMeter,heightB);
	}
	public ParentsRoom(int length ,int width ,int costPerMeter,Bathroom path) {
		super(length ,width ,costPerMeter); 
		bRoom = new Bathroom(path.getLength(),path.getWidth(),path.getHeight(),costPerMeter);
	}
	
	@Override
	public int cost() {
		return super.cost()+bRoom.cost();
	}
	
	@Override
	public String toString() {
		String s="Parents Room has room and bath :\n";
		s+=super.toString();
		s+=bRoom.toString();
		return s;
	}
	
}
