package abstraction;

public class HierarchialChild2  extends HierarchialParent{
	
	public void show() {
		System.out.println("Implementaion of HierarchialParent's abstract method inside HierarchialChild2 class");
	}

	public static void main(String[] args) {
		HierarchialParent obj = new HierarchialChild1();  // upcasting parent class name , which class you want to print
		HierarchialParent obj1 = new HierarchialChild2();
		obj.show();
		obj1.show();
	}
}
