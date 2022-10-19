package com.evaque3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int a = 64;
			int b = 70;
			byte c =(byte)(a+b);
			
			System.out.println(c);
			
			/* 1.this is the exmple of  explicit typecasting
			 2. also know as narrowing casting .
			 3 .we cannot assign int to byte beacause byte having oneing only 
			 1 byte,and int having 4 byte so we canntot convert one byte to 4 byte but 
			 with the help of explicit casting we can canconvert byte to int but 
			 byte having a some certain range -128 to 127;
			 
			 here we can add 64 ans 70 that is the 134 so the byte having range after 127 its converign to - and the ans is -122
		

             */
	}

}
