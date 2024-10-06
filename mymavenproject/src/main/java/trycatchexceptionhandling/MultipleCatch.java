package trycatchexceptionhandling;

public class MultipleCatch {

	public static void main(String[] args) {
		try
		{		
			int a = 10/0;			
		}
		catch(ArithmeticException e)  
		{
			System.out.println(e);  
		}			
		catch(NullPointerException e)  
		{
			System.out.println(e);  
		}			
		catch(Exception e)    // must be last catch
		{
			System.out.println(e);  
		}
	}

}
