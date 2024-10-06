package interfacepackage;

public class ChildClass implements Parent1,Parent2{
	
	public void show() {
		System.out.println("Showw");
	}

	public void display() {
		System.out.println("display");
	}
	
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.show();
		obj.display();
		
		
	}

}
