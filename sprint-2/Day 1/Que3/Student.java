package com.Que3;

public class Student {
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("Roll is :"+ roll);
		System.out.println("name is :"+ name);
		System.out.println("marks is :"+marks);

	}

	public static void main(String[] args) {
		
		Student std = new Student();
		std.roll=112;
		std.name="kundan";
		std.marks=10;
		
		std.displayStudentDetails();
		
		Student std2 = new Student();
		std2.roll=13;
		std2.name="lakhan";
		std2.marks=15;
		
		std2.displayStudentDetails();

		std=null;
		std2=null;
		
           
	}

}
