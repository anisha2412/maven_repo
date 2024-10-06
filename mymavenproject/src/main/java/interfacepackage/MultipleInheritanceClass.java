package interfacepackage;

public class MultipleInheritanceClass implements interfaceparent1,interfaceparent2{
	
	public void show() 
	{
		System.out.println("Multiple Inheritance from interface parent class 1");
	}

	public void display() 
	{
		System.out.println("Multiple Inheritance from interface parent class 2");
	}


	public static void main(String[] args)
	{	
		MultipleInheritanceClass obj =new MultipleInheritanceClass();
		obj.show();
		obj.display();
	}

}
