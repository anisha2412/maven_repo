//no IS a relationship
//Has a relationship [ encapsulation , aggregation ]

// get from main method and print in instance method using same instance var.

package aggregation;

public class Address 
{	
	String city;
	String state;     // instance var 
	String country;
		
	public Address(String city,String state,String country)   // const.
	{		
		this.city = city;
		this.state = state;
		this.country = country;						
	}		
}
