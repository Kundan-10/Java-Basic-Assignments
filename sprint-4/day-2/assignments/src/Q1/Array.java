package Q1;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
	

	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<>();
		
		name.add("kundan");
		name.add("lakhan");
		name.add("pratik");
		name.add("ramesh");
		name.add("pankaj");
		

		
		for(int i=0; i<name.size(); i++) {
			String s=name.get(i);
			System.out.println(s);
			
		}
		System.out.println(name);
		
		name.add("kunal");
		
		for(String x:name) {
			System.out.println(x);
		}
		System.out.println(name);
		
		
		
		Iterator<String> itr= name.iterator();
		
		while(itr.hasNext()){
			String s= itr.next();
			System.out.println("hasNext "+s);
			}

	}

}
