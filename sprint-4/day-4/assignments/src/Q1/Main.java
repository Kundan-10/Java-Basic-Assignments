package Q1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	 
	     
		System.out.println("how many product you add ");
		int n=sc.nextInt();
		
		
		TreeSet<Product> pr=new TreeSet<>(new productPrice());

		
		
		for(int i=1; i<=n; i++) {

			System.out.println("productName");
			String pName=sc.next();
			
			System.out.println("productId");
			int pId=sc.nextInt();
			
			System.out.println("productPrice");
			int pPrice=sc.nextInt();
			
			
			
			pr.add(new Product(pId, pName,pPrice));
			
			for( Product pr1:pr) {
				System.out.println(pr);
			}
		}
		
		
		System.out.println("Enter the choice");
		int ch=sc.nextInt();
		
		if(ch==1) {
			new TreeSet<>(new productPrice());
			
		 System.out.println(pr);
		}else if(ch==2) {
			new TreeSet<>(new productName());
			 System.out.println(pr);
		}else if(ch==3) {
			new TreeSet<>(new ProductId());
			 System.out.println(pr);
		}else {
			new TreeSet<>(new ProductId());
			 System.out.println(pr);
		}
		
	
	
		
		
	
	}

}
