package com.Que1;

public class Main {

	public static void main(String[] args) {
	
		Bird b1 = new Parrot();
		b1.fly();
		
		
		Parrot p1=(Parrot)b1;
		
		p1.sing();
		//and after downcasting this b1 reference to the
		//Parrot class object, call the sing method also

	}

}
