// Write a program to set your name and age by a static method and get them in an another static method
 
package mymavenassignments;

public class Assignment1 {
	
	public static void show(String name, int age) {
	
			System.out.println("My name is " + name);
			System.out.println("I am " + age + " years old");
	}

	public static void main(String[] args) {
		
		String name="Anisha";
		int age = 25;
		Assignment1.show(name,age);
	}

}
