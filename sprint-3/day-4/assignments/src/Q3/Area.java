package Q3;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		int cal=length * breadth;
		
		return cal;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		int cal=side*2;
		return cal;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		float cal=(float) (3.14 *2*radius);
		return (int)cal;
	
	}

}
