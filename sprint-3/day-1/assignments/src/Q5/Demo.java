package Q5;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Student s=new Student();
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of student");
        int stNo=sc.nextInt();   
        
        Student [] student=new Student[stNo];
        
      
    
        for(int i=0; i<stNo; i++) {
        	System.out.println("Enter details of : "+(i+1));
        	
        	System.out.println("Enter the name of student");
        	String name=sc.next();
        	s.setName(name);
        	
        	System.out.println("Enter the roll of student");
        	int roll=sc.nextInt();        	
//        	s.setRoll(roll);
        	
        	System.out.println("Enter the address of student");
        	String add=sc.next();
        	s.setAddress(add);
        	
        
        	
        	System.out.println("Enter the marks of student");
        	int mark=sc.nextInt();
        	s.setMarks(mark);
        	
        	
        	 System.out.println(s.getRoll());
 		    System.out.println(s.getName());
 		    System.out.println(s.getMarks());
 		    System.out.println(s.getAddress());
        	
 		   
		 
        
        }
    

	}

}
