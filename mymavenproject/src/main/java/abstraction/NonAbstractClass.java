package abstraction;

public class NonAbstractClass extends AbstractClass{
	
	public void show() {
		System.out.println("Implemenation of abstract method from AbstractClass inside NonAbstractClass");
	}

	public static void main(String[] args) {
		NonAbstractClass obj = new NonAbstractClass();
		obj.show();
		obj.display(); // displaying because of using extends
	}
}

// Inside the abstract class, only the declaration is shown, hiding the implementation.