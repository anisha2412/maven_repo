package aggregation;

public class Employee {
		
	int id;
	String name;
	
	Address ref_var;          // 1st class reference var declared ad instance var
	
	public Employee(int id,String name,Address ref_var)     // const.
	{  
		this.id = id;
		this.name = name;
		this.ref_var = ref_var;
	}
	
	public void show()
	{
		System.out.println(id + " " + name);		
		System.out.println(ref_var.city + " " + ref_var.state + " " + ref_var.country); // from 1st class Address
	}

	public static void main(String[] args) 
	{
		Address obj1 = new Address("Thodupuzha","Kerala","India");
		Employee obj = new Employee(101,"Anisha",obj1);
		obj.show();		
	}

}
