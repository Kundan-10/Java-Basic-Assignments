package Q4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Libery {
	List<Book> bookList = new ArrayList<>();	
	
	void addBook(Book book) {
	 bookList.add(book);
	}
	
	boolean isEmpty() {
		return bookList.isEmpty();
		
	}
	List<Book>viewAllBooks(){
		return bookList;
		
		
	}
	List<Book>viewBooksByAuthoe(String author){
		

		
		for(Book b:bookList) {
			String bk=b.getAuthor();
			if(bk.toUpperCase().equals(author.toUpperCase())) {
				bookList.add(b);
			}
			
		}
		return bookList;

	
	}
		
	
	
	int countNoOfBooks(String bookname) {
	      int count=0;
	      
	      
	      for( int i=0; i<bookList.size(); i++) {
	    	  Book b=new Book();
	    	   if(b.getBookname().equalsIgnoreCase(bookname));
	    	   count++;
	      }
	      return count;
	
	}


	
}
