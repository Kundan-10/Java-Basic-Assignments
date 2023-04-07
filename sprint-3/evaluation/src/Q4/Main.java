package Q4;

import java.util.Scanner;

public class Main {
	
	
		


	public static void main(String[] args) {
      
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String =>");
		String name=sc.next();
		
		
		System.out.println("Enter a position =>");
		int pos;
		pos=sc.nextInt();
		
		int n=name.length();
	
		while(pos>n) {
			System.out.println("Invalid position, Please enter a valid position =>");
		     pos=sc.nextInt();
			
		} 
		
		if(pos<=n){
			char postion=name.charAt(pos);
			System.out.println(postion);
			
			System.out.println("Character at the position "+pos+" => "+postion);
		}
		
		
	
		

	}

}
