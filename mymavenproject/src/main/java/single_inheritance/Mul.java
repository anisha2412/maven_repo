package single_inheritance;

public class Mul extends Sum{
	
	public void multiplication() 
	{
		int a =10;
		int b=20;
		int mul=a*b;
		System.out.println("Multiplied Value : " + mul);
	}

	public static void main(String[] args) 
	{
		Mul obj = new Mul();
		obj.multiplication();
		obj.add();
	}
}
