package Q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numberof passenger");
		int pass=sc.nextInt();
	
	     c.setNumberOfKms(pass);
		
		System.out.println("Enter the numberof kilometer");
		int km=sc.nextInt();
		c.setNumberOfKms(km);
		
		Ola myOla = new Ola();
		Car myCar = myOla.bookCar(pass, km);
		
		int res=myOla.calculateBill(myCar);
		
		System.out.println("The total fare amount is "+ res);
		


	}

}
