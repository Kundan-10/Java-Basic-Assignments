package Q3;

public class Main {

	public static void main(String[] args) {
     Area a=new Area();
     
     int cc= a.circleArea(10);
     int rr=a.rectangleArea(10, 10);
     int ss=a.squareArea(10);
     
     System.out.println("Area of circle is "+ cc);
     
     System.out.println("Area of reactangle is "+rr);
     
     System.out.println("Area of square is "+ss);

	}

}
