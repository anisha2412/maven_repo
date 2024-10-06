package collection;

import java.util.ArrayList;

public class ArrayListGeneric {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>(); 
		obj.add("haiii");
		obj.add("helo");
		obj.add("hey");
		obj.add(0,"hi");    // add new element in specified index position
		System.out.println("Generic ArrayList : " + obj);
	}
}
