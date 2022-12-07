package Q4;
public class factorial {

	public static void main(String[] args) {
		
		int v =Integer.parseInt(args[0]);
		int v2=Integer.parseInt(args[1]);
		
		if(args.length == 1) {
			
			int m=1;
			for(int i=1; i<=v; i++) {
				m=m*i;
			}
			System.out.println(m);
		}
		
		else if(args.length==2) {
			int a=Math.abs((v+v2)/2);
			
			System.out.println(a);
		}else {
			System.out.println("Error");
		}
		
		
	

	}

}
