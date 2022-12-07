package Q3;

public class Main {
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		
		int [] arr=new int[7];
		
		
		
		for(int i=0; i<inputArray.length; i++) {
			boolean flag=false;
			int arr1=inputArray[i];
			
			for(int j=2; j<arr1/2; j++) {
				
				if(arr1 % 2 == 0) {
					flag=true;
					break;
				
			}
		}
			if(!flag) {
				arr[i]=arr1;
			}
			
		}
		return arr;
		
		
		
		//write the logic to iterate through the supplied inputArray and return array of prime
		//if no prime number is found then return the empty array.
		}

	public static void main(String[] args) {
	
		Main m=new Main();
		
		int[] arr = {10,12,5,50,11,14,15};
		int []t=m.findAndReturnPrimeNumbers(arr);
		
//		int len=t.length;
	
			for(int i=0; i<t.length; i++) {
				
				if(t[i]==0) {
				System.out.println("Prime number not found in the supplied Array");
				}else if(t[i]!=0){
			     System.out.println(t[i]);
			}
		
		
		//print each element from the returned array of findAndReturnPrimeNumbers method
		//if findAndReturnPrimeNumbers method returns an empty array then print the following
	
		// 


	}

}
}
