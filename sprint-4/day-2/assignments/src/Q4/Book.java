package Q4;

public class Book {
	
	private int isbn;
	private String bookname;
	private String author;
	
	
	Book(int isbn,String bookname,String author){
		this.isbn=isbn;
		this.bookname=bookname;
		this.author=author;
	}
	
	Book(){
		
	}
	
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
