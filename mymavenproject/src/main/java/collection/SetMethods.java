package collection;

import java.util.HashSet;

public class SetMethods {

	public static void main(String[] args) {
		HashSet<Integer> obj = new HashSet<Integer>(); 
		obj.add(3);
		obj.add(3);       // duplication not allowed
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.add(9);
		
		//System.out.println(obj.contains(3));  // check availability  - true
		//System.out.println(obj.contains(322));   // false
		
		//obj.remove(3);
		//System.out.println(obj);         // remove all 3
		
		//obj.clear();
		System.out.println(obj);       
	}

}
