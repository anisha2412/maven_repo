//Declare  student name and age inside 1st class as instance variable and pass value from main method and 
//print inside default instance method [use parameterized constructor]
//Declare id,number,school name inside 2nd class
//Get value from the main method, using parameterized constructor

package aggregation;

public class Student 
{	
	String name;     // instance variable 
	int age;     
		
	public Student(String name,int age)  // parameterized constructor
	{    		
		this.name = name;
		this.age = age;			
	}
}
