package abstraction;

public class NonAbstractClass1 extends AbstractClass1{
	
	public void show() 
	{		
		System.out.println("Implementaion of abstract method inside nonabstract class");		
	}
	public static void main(String[] args) 
	{	
		NonAbstractClass1 obj = new NonAbstractClass1(); 
		obj.show();
		obj.display();   
	}
}

//It also prints what is inside the constructor from the abstract class because it extends the abstract class,
//so there is an IS-A relationship.