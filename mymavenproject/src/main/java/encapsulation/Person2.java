package encapsulation;

public class Person2 {

	public static void main(String[] args) {
		Person1 obj = new Person1();     // 1st class's clsname
		
		obj.setAge(25); // setting age for var declared in other class
		
		System.out.println(obj.getAge());
		
		obj.setName("Achu");  // setting name for var declared in other class
		
		System.out.println(obj.getName());
	}

}
