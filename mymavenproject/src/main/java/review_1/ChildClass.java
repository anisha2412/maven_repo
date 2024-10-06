package review_1;

public class ChildClass  implements Interface1, Interface2{
	
	public void show() 
	{
		System.out.println("interface 1");
	}
	
	public void display() 
	{
		System.out.println("Interface 2");
	}
	
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.show();
		obj.display();
		
		

	}

}
