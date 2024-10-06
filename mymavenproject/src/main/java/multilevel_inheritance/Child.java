package multilevel_inheritance;

import mymavenassignments.Parent;

public class Child extends Parent{
	
	public void son() {
		System.out.println("son");
	}

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.son();
		obj.father();
		obj.grantfather();
		
	}

}
