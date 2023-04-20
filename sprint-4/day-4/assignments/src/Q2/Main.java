package Q2;

import java.util.Scanner;
import java.util.TreeSet;



public class Main {

	public static void main(String[] args) {
	
         Scanner sc=new Scanner(System.in);
         
         System.out.println("enter the details of  employee");
         
        
         
         Employee emp=new Employee();
      
         
         TreeSet<Employee> pr=new TreeSet<>(emp);
         
         for( int i=0; i<4; i++) {
        	 
        	 System.out.println("empName");
 			String pName=sc.next();
 			
 			System.out.println("empId");
 			int pId=sc.nextInt();
 			
 			System.out.println("salary");
 			int pPrice=sc.nextInt();
 			
 			
 			pr.add(new Employee(pId, pName,pPrice));
 			System.out.println(pr);
         }
         
        System.out.println(pr);
	}

}
