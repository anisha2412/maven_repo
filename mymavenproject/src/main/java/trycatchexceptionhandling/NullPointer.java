package trycatchexceptionhandling;

public class NullPointer {

	public static void main(String[] args) {
		try 
		{			
			String a = null;
			System.out.println(a.length());
		}
		catch(NullPointerException e) 
		{
			System.out.println(e);			
		}
	}
}
