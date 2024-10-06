package superusage_for_const;

public class Dog extends Animal{
	
	public Dog()   // const.
	{	
		super();   // invoke parent class's const.
		
		// if we don't add super keyword , complier automaticaly add super if we extend
		System.out.println("Dog Constructor");
	}

	public static void main(String[] args) {
		
		Dog obj = new Dog();
	}

}
