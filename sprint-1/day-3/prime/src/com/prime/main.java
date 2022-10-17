package com.demo;

public class main {
	
	static void primeV(int n) {
		
	          if(n>=100) {
	        	  System.out.println("Invalid number");
	          }else {
	     		 for(int i=1; i<=n; i++){
	  		       if(n%i == 0) {
	  		  		 System.out.println(i);
	  		       }
	  		    	 
	  		     
	  	       
	          }
	       }
	
		
	    }

	public static void main(String[] args) {
	 
       primeV(12);
	}

}
