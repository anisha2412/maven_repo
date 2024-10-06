package superusage_for_var;

public class Dog extends Animal
{
		
	String name = "Inaya";     // instance var
	
	public void display() {
		System.out.println(super.name);    // print parent class's var
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.display();
	}

}
