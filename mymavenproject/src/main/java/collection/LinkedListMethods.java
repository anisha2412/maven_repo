package collection;

import java.util.LinkedList;

public class LinkedListMethods 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> obj = new LinkedList<Integer>(); 
		obj.add(3);
		obj.add(5);
		obj.add(6);
					
		for(int temp:obj){                  // LinkedList for each
        	System.out.println(temp);
        }
		
		//obj.addFirst(1);                 // add 1 to 0th index as 1st element.
		//System.out.println(obj);
		
		//obj.removeFirst();               // remove 0th index element 
		//System.out.println(obj);
		
		//obj.removeLast();                // remove last index element 
		//System.out.println(obj);
		
		//System.out.println(obj.getFirst());		// get 0th index element
		//System.out.println(obj.getLast());        // get last index element
	}
}
