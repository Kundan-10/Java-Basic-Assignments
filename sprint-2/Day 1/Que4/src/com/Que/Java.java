package com.Que;

public class Java {
	
	void number(int a) {
		if(a>0 && a%2==0) {
		     int b=(int)Math.floor(a/10);
			System.out.println((b+1)*10);
			
		}else if(a>0 && a%2!=0) {
			System.out.println(a);
		}else {
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		Java num=new Java();
		num.number(44);
		num.number(45);
		num.number(-5);

	}

}
