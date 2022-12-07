package Que3;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	    Employee em=new Employee();
	    Manager man=new Manager();
	    
		String n=man.name="kundan";
	   String add=man.Address="Nagpur";
	    String no=man.phoneNumber="7775060748";
	   int age= man.age=21;
	   double s= man.Salary=90000;
	    man.printSalary();
	   String de= man.Department="IT";
	   String sp= man.Specialisation="Java";
	   
	   
	   
		String n1=em.name="kundan";
	   String add1=em.Address="Nagpur";
	    String no1=em.phoneNumber="7775060748";
	   int age1= em.age=21;
	   double s1= em.Salary=90000;
	    
	    em.printSalary();
	    
	   String de1= em.Department="IT";
	   String sp1= em.Specialisation="Java";
	   
	   
	   

	   System.out.println(n);
	   System.out.println(add);
	   System.out.println(s);
	   System.out.println(no);
	   System.out.println(age);
	   
	   System.out.println(de);
	   System.out.println(sp);
	   
	  
	   
	   System.out.println("===================");
	   

	   System.out.println(n1);
	   System.out.println(add1);
	   System.out.println(s1);
	   System.out.println(no1);
	   System.out.println(age1);
	
	   System.out.println(de1);
	   System.out.println(sp1);
	   System.out.println(de1);
	   System.out.println(sp1);
	   

	}

}


//in it and assign name, age, phone
//number, address and salary to an employee and a
//manager by making an object of both of these
//classes and print the same.