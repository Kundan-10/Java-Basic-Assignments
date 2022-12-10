package com.s2day3;

public class Main {

	public static void main(String[] args) {
		Student s1=new Student(10,"kundan",20,200);
		
		Student s2=new Student();
		
		s2.setAge(19);
		s2.setMarks(200);
		s2.setName("kundan");
		s2.setRoll(112);
	
		
	int age=s1.getAge();
	int marks=s1.getMarks();	
	
	int age2=s2.getAge();
	int marks2=s2.getMarks();
		
		if(age>18 && age<60 && marks>0 && marks<500 ) {
			 System.out.println("name is : "+s1.getName());
			 System.out.println("marks is : "+marks);
			 System.out.println("age is : "+age);
			 System.out.println("roll is : "+s1.getRoll());
			 
			 System.out.println("=====================");
			
			}
		else {
			System.out.println("error");
		}

		if(age2>18 && age2<60 && marks2>0 && marks2<500 ) {
			 System.out.println("name is : "+s2.getName());
			 System.out.println("marks is : "+marks2);
			 System.out.println("age is : "+age2);
			 System.out.println("roll is : "+s2.getRoll());
			
			}
		else {
			System.out.println("error");
		}
	
	
	}

}
