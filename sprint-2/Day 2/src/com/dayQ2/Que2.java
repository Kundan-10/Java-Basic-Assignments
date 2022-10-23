package com.dayQ2;

public class Que2 {
	
	void vowels(String a) {
		if(a.length() <= 1) {
			if(a=="a" || a=="i" || a=="e" || a=="o" || a=="u" ||a=="A"|| a=="I" || a=="E" || a=="O" || a=="U") {
				System.out.println(a+" is vowels");
			}else {
				System.out.println(a+" is consonant");
			}
		}else {
			System.out.println("Error");
		}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Que2 v=new Que2();
         
         v.vowels("z");
         
         v.vowels("asds");
	}

}
