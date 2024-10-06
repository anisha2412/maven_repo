//try- catch - finally - ArithmeticException

package trycatchexceptionhandling;

public class ArithemeticExcp {
	
	public static void main(String[] args) {		
		try
		{		
			int a = 10/0;	
			//int a = 10/5;     // for finally
		}
		catch(ArithmeticException e)   // ArithmeticException object name
		{
			//System.out.println("Arithmetic Exception Handled");
			System.out.println(e);  // print caught exception
		}	
		
		finally {      // always execute
			System.out.println("Finally exception!!!");
		}
	}
}
