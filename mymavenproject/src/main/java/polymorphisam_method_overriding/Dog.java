package polymorphisam_method_overriding;

public class Dog extends Animal{
	
	public void run() {
		System.out.println("Dog Bark");
	}
	
	public static void main(String[] args) {		
		Dog obj=new Dog();
		obj.run();		
	}

}
