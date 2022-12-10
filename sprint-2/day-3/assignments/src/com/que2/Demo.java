package com.que2;

public class Demo {
	Demo(){
		this("string type demo consructor");
		System.out.println("inside a Demo()");
		
	}
	Demo(String s){
		this(10);
		System.out.println("this is the Demo(string s )");
		
	}
	
	Demo(int i){
		this(15f);
		System.out.println("this is the Demo (int i)");
		
	}
	
	Demo(float f){
		System.out.println("this is the Demo(float f)");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		
		

	}


}
