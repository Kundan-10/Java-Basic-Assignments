package com.evalution;

//QUESTION NO 2;

public class Main {
	static void printMonths(String month) {
		
		switch(month) {
		case "JAN":
			System.out.println("This is the 1st Month of the Year January");
			break;
		
	    case "FEB":
		System.out.println("This is the 2st Month of the Year february");
		break;
		
	    case "MAR":
			System.out.println("This is the 3st Month of the Year MARCH");
			break;
	    case "APR":
			System.out.println("This is the 4st Month of the Year APRIL");
			break;
	    case "MAY":
			System.out.println("This is the 5st Month of the Year MAY");
			break;
	    case "JUN":
			System.out.println("This is the 6st Month of the Year JUN");
			break;
	    case "JUL":
			System.out.println("This is the 7st Month of the Year JULY");
			break;
			
	    case "AUG":
			System.out.println("This is the 8st Month of the Year AUGUST");
			break;
			
	    case "SEP":
			System.out.println("This is the 9st Month of the Year SEPTEMBER");
			break;
	    case "OCT":
			System.out.println("This is the 10st Month of the Year OCTOMBER");
			break;
	    case "NOV":
			System.out.println("This is the 11st Month of the Year NOVEMBER");
			break;
	    case "DEC":
			System.out.println("This is the 12st Month of the Year DECEMBER");
			break;
	}
	}

	public static void main(String[] args) {
		printMonths("MAY");

	}

}
