package single_inheritance;

import multilevel_inheritance.Dog;

public class BabyDog extends Dog{
	
	public void sleep() {
		System.out.println("Sleeping");
	}

	public static void main(String[] args) {
		
		BabyDog obj= new BabyDog();
		obj.sleep();
		obj.bark();
	}

}
