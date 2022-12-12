package Q3;

import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	
	void displayCourseDetails() {
		
		System.out.println("Your courseName is:- "+courseName);
		System.out.println("Your courseFee is:- "+courseFee);
		System.out.println("Your courseId is:- "+courseId);
		
	}
	static void authenticate(String userName,String password) {
		Course  course=new Course();
	
         Scanner sc=new Scanner(System.in);
		if(userName=="Admin" && password=="1234") {
			
//			System.out.println("user login succesfull");
			
			 System.out.println("Enter courseName");
			 String cName=sc.next();
			 course.courseName=cName;
			 
			 System.out.println("Enter courseFee");
			 int cFee=sc.nextInt();
			 course.courseFee=cFee;
			 
			 System.out.println("Enter courseId");
			 int cId=sc.nextInt();
			 course.courseId=cId;
			
			course.displayCourseDetails();
			
		
		}else {
			System.out.println("Invalid Username or password");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Course.authenticate("Admin", "1234");
	Course.authenticate("kundan", "12345");
		


	}

}
