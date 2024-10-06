package collection;

import java.util.List;
import java.util.ArrayList;

public class ListGeneric 
{
    public static void main(String[] args) 
    {
        List<Integer> obj = new ArrayList<Integer>();
        obj.add(10);
        obj.add(20);
        obj.add(30);     
        System.out.println("Generic List elements: " + obj);
        
        for(int temp:obj)             // for each loop is used to collection
        {          
        	System.out.println(temp);
        }
    }
}
