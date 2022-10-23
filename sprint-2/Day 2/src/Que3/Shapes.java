package Que3;

public class Shapes {
	
	public class Shape {
		public void area(Circle circle) {
			int a=circle.radius;
			
			double radi=((3.14)*(Math.pow(a, 2)));
			System.out.println(radi);
	
		}
		public void area(Rectangle rectangle) {
			int a=rectangle.length;
			int b=rectangle.breadth;
		int area = a*b;
		System.out.println(area);
		}
		public void area (Square square) {
		  int a=square.side;
		  double b=Math.pow(a, 2);
		  System.out.println(b);
		}
		
		public static void main(String[] args) {
		
		}
	}
}



/*static polymorphism 
 * 
 * static polymorphism is the also called as runtime polymorphism .
 * static polymorphism is used when we have to write same method but different parameter  for multiple times;
 * static poly we achieve static polymerphosm by using method overloading ..
 * 
 * 
 * here we are use area method for 3 times with different parameter in such case we can use static poly.
 * 
 * 
 */
