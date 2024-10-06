// throw - 

package throwexception;

public class Throw {
	
	public void show(int age) 
	{		
		if(age<18) 
		{			
			throw new ArithmeticException("Person is not eligible to vote");  //throw exception based on user entering value			
		}
		else 
		{
			System.out.println("Person is eligible to vote");
		}				
	}
	public static void main(String[] args) 
	{			
		Throw obj =new Throw();
		obj.show(15);		
	}
}
