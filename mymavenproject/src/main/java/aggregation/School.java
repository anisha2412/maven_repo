package aggregation;

public class School 
{
	int id;
	String phonenumber;
	String school_name;
	
	Student ref_var;          // 1st class's reference variable declared as instance variable[ Class name refvar;]
	
	public School(int id, String phonenumber, String school_name, Student ref_var)       // parameterized constructor
	{
		this.id = id;
		this.phonenumber = phonenumber;
		this.school_name = school_name;
		this.ref_var = ref_var;
	}
	public void show()
	{
		System.out.println("Student name : "+ ref_var.name);   // from 1st class Address , refvar.var_name	
		System.out.println("Student age : "+ ref_var.age);  
		
		System.out.println("Student ID : " + id);	
		System.out.println("Phone Number : " + phonenumber );	
		System.out.println("School name : " + school_name);	
	}
	public static void main(String[] args) 
	{		
		Student obj = new Student("Anisha Madhu",25);
		School obj1 = new School(101, "7306700000","Vimala Public School",obj); // pass 1st class object to constructor.
		obj1.show();
	}
}
