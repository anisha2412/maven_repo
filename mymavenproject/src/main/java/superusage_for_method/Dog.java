package superusage_for_method;

public class Dog extends Animal{
	
	public  void run() {
		
		super.run();   // invoke parent class method using super keyword
		
		System.out.println("Dog Bark");
	}
	

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.run();	

	}

}
