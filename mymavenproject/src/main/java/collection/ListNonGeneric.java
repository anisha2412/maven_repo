package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListNonGeneric 
{
	public static void main(String[] args) 
	{
		List obj = new ArrayList(); 
        obj.add(10);   
        obj.add(20.5f);  
        obj.add('A');  
        obj.add("Hello"); 
        System.out.println("Non Generic List elements: " + obj);
        
        Iterator itr = obj.iterator();

        while (itr.hasNext()) 
        {
            System.out.println(itr.next());          
        }
        
        //iterator.hasNext(): Checks if there are more elements in the list.
       // iterator.next(): Retrieves the next element in the list.
        
	}
}
