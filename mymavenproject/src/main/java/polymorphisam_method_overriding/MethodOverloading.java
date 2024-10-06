//aug 23

package polymorphisam_method_overriding;

public class MethodOverloading {
	
	public void add(int a ,int b) {	
		int sum = a+b;
		System.out.println("Adding 2 int numbers: " + sum);
	}
	
	public void add(int a ,int b,int c) {		
		int sum = a+b+c;
		System.out.println("Adding 3 int numbers: " + sum);
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(2,3);
		obj.add(2,3,6);		
	}
}
