package Q2;

import java.util.Scanner;

public class Main {
	
  static	void calculateAverage(int age){
	  
      Scanner sc=new Scanner(System.in);
		
  	System.out.println("Enter the age for "+age+"employees");
  	
		int sum=0;
		for(int i=0;i<age;i++) {
		
			int em=sc.nextInt();
			
			sum+=em;
		
		}
		
		float aver=(sum / age);
	
		System.out.println("Average of emplaoyee is : "+ aver);
		
	
	}
	
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter total no of employee");
			int noEm=sc.nextInt();
			
			if(noEm>1) {
				calculateAverage(noEm);
			}else {
				System.out.println("Please enter a valid employee count");
			}
	
		
		}
		
	}


