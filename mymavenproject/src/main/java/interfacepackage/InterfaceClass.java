package interfacepackage;

public class InterfaceClass implements Interface1{
	
	public void show() 
	{
		System.out.println("Abstract Method from Interface "
				+ " implementing inside" + " class ");
	}

	public static void main(String[] args) 
	{
		InterfaceClass obj = new InterfaceClass();
		obj.show();
	}

}
