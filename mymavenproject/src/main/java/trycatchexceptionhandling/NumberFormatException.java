package trycatchexceptionhandling;

public class NumberFormatException {

	public static void main(String[] args) 
	{
		try 
		{	
			String a = "Haii";
			int b = Integer.parseInt(a);	
		}
		catch(Exception e) 
		{
			System.out.println(e);	
		}
	}
}
