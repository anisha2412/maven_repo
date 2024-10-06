package interfacepackage;

public class HierarchialChildClass2 implements HierarchialInterface{
	
	
	public void show() {
		System.out.println("Hierarchial Child Class2 ");
	}


	public static void main(String[] args) {
		HierarchialInterface  obj = new HierarchialChildClass1();
		obj.show();

	}

}
