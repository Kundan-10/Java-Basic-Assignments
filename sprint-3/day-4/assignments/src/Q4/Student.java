package Q4;

import java.util.Scanner;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private char grade;

	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	

	public void displayDetails() {
		Student st=new Student();
		
		Scanner sc =new Scanner(System.in);
	
		System.out.println("Enter the name ");
		String n=sc.next();
		 name=n;

		
		System.out.println("Enter the roll");
		int r=sc.nextInt();	
		roll=r;

		
		System.out.println("Enter the marks");
		int m=sc.nextInt();	
		marks=m;
		st.setMarks(m);

		
		char gg=st.calculateGrade();
		grade=gg;
		
		
	
		System.out.println("grade of Student is "+gg);
		
	}
	
	private char calculateGrade() {
	
		
		if(marks>=500) {
			
		      char aa=grade='A';
		 
			return aa;
		}else if(marks<500 &&marks >=400 ) {
			grade='B';
			return grade;
		}else {
			grade='C';
			return grade;
			
		}

	}
	
	
	
	Student(){
	
	}
	
	@Override
	public String toString() {
		Student st=new Student();
		return "Student [roll=" + roll + ", name=" + name + ", marks=" +marks + ", grade=" + grade + "]";
	}


}
