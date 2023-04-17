package Q2;


import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
    	  Song son=new Song();

         PlayList pp=new PlayList();
    	 Scanner sc=new Scanner(System.in);
    	  
    	
    	  System.out.println("Enter 4 songs Details");
    	  
    	  for(int i=1; i<=4; i++) {
    		  
    		  System.out.println("Enter movieName");
    		  String name=sc.next();
    	      son.setMovieName(name);
    		  
    		  System.out.println("Enter songsName");
    		  String sName=sc.next();
    		  son.setSongsName(sName);
    		  
    		  pp.addSong(new Song(name,sName));
    		 
    	    	
    		  
    	  }
    	  System.out.println(pp.songs.size());
    	  System.out.println(pp.songs);
    	  
    	  
    
    	  
    	 
	}
}
