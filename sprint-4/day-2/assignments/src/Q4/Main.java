package Q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		 Libery lib=new Libery();
		 
		 int i; 
		 int ch ;
		 
		 for(i=0; i<3; i++) {
			 
			    System.out.println("1.Add Book");
	            System.out.println("2.Display all book details");
	            System.out.println("3.Search Book by author");
	            System.out.println("4.Count number of books - by book name");
	            System.out.println("5.Exit");
	            
	            
	            System.out.println("Enter your choice:");
	             
	             ch =s.nextInt();
	             
	             if(ch==1) {
	            	  Book b=new Book();
	            	  
	                  System.out.println("Enter the isbn no:");
	                  int bn=s.nextInt();
	                  b.setIsbn(bn);
	       
	              
	                  
	                  System.out.println("Enter the book name:");
	                  String name=s.next();
	                  b.setBookname(name);
	                  
	                  System.out.println("Enter the author name:");
	                  String aName=s.next();
	                  b.setAuthor(aName);
	                  
	                  lib.addBook(b);
	                  System.out.println("Book added Successfully");
	             }
	             
		 
         if(ch==2){
        	 
        	List<Book> result= lib.viewAllBooks();
        	
        	for(Book b:result) {
        		System.out.println("Book isby no: "+b.getIsbn());
				System.out.println("Book Name: "+b.getBookname());
				System.out.println("Author Name: "+b.getAuthor());
				System.out.println("==============================");
        	}
                
         }  
         if(ch==3) {
        	 System.out.println("Enter the Author name");
        	 
        	 String aName=s.next();
        	 
        	 
        	 List<Book> aBook=lib.viewBooksByAuthoe(aName);
        	 
        	 if(aBook.size()>0) {
        		 for(Book b:aBook) {
        			 
        		 for(b.getAuthor().equals(aName);;) {
        				System.out.println("Book isbn no: "+b.getIsbn());
         				System.out.println("Book Name: "+b.getBookname());
         				System.out.println("Author Name: "+b.getAuthor());
         				System.out.println("==============================");
        		 }
        		 }
        	
        	 }else {
          		System.out.println("None of the book published by the author "+aName);
          	}
         }
         
         if(ch==4) {
        	 System.out.println("Enter the book name");
        	 String bookN=s.next();
        	 
        	 int count=lib.countNoOfBooks(bookN);
        	 System.out.println("No of book by book name "+bookN+" is "+count);
        	 
         }
         
         
         if(ch==5) {
        	 System.out.println("Thank You...!!");
        	 break;
         }
	  }

		
	}
}

