package collection;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) 
	{
		ArrayList<String> obj = new ArrayList<String>(); 
		obj.add("Hai");
		obj.add("Hello");
		obj.add("Hey");
		
		//System.out.println("Get Method : " + obj.get(2));   // retrieve using index position
		
		//obj.set(1,"Hlo");               // remove previous element and add new
		//System.out.println("Set Method : " + obj); 
		
		//obj.remove(0);                	  // remove 0th index element
		//System.out.println("Remove Element Method : " + obj); 
		
		//obj.clear();                      // clear Array list and display empty list
		//System.out.println("Clear Method : " +obj); 
		
		//System.out.println("ArrayList size : " + obj.size());    // size of array list
		
		for(int i=0;i<obj.size();i++) 
		{
			System.out.println(obj.get(i));          // for loop
		}
		
		
		
		
		
	}
}
