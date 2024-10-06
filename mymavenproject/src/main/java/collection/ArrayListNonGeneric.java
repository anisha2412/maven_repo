package collection;

import java.util.ArrayList;

public class ArrayListNonGeneric {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList(); 
		obj.add("haiii");
		obj.add(2);
		obj.add(4.5f);
		obj.add(0,'A');    
		System.out.println("Non Generic ArrayList : " + obj);

	}

}
