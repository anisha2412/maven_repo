package abstraction;

public abstract class AbstractClass1 {         
	
	public  AbstractClass1 ()
	{		
		System.out.println("Constrctor from abstract class");
	}

	abstract void show();      // abstract method
	
	public void display ()
	{	
		System.out.println("Nonabstract method of abstract class");
	}
}
