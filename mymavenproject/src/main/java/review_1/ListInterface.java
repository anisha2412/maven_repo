package review_1;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List<Integer> obj = new ArrayList();
		obj.add(1);
		obj.add(4);
		obj.add(6);
		obj.add(7);
		obj.add(8);
		System.out.println(obj);
		
		List obj1 = new ArrayList();
		obj1.add(1);
		obj1.add('A');
		obj1.add(6.7f);
		obj1.add("Haii");
		System.out.println(obj1);
		

	}

}
