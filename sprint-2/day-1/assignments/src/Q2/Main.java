package Q2;

import java.util.Scanner;

public class Main {
	
     static void sum(int row,int col) {
		
		int[][]  arr= new int[row][col];
		
		int c=1;
        for(int i=0;i<row;i++) {
        	
//			int bag=0;
        	
			for(int j=0;j<col;j++) {
				
		     arr[j][i]=c;
				c++;
				
			}	
			  System.out.println();
		}
        
        
        for(int[] ar:arr) {
        	int bag=0;
        	for(int j:ar) {
        		if(j%2==0) {
        			bag=bag+j;
        		
        			
        		}
        		
        	}System.out.println(bag);
        	
        }
      
        
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Number of Rows");
		int row=sc.nextInt();
		
		System.out.println("Enter a Number of colums");
		int col=sc.nextInt();
		
		 sum(row, col);
		
		
	}

}
