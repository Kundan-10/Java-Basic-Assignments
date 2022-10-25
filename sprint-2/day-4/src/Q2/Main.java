package Q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String name=sc.nextLine();
		
		System.out.println("Enter the character position you want to access:");
		int positon=sc.nextInt();
		
		char pos=name.charAt(positon);
		System.out.println("Character at position : "+pos+" is");

	}

}
