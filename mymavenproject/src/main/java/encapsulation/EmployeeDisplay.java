package encapsulation;

public class EmployeeDisplay {

	public static void main(String[] args) {
		Employee obj = new Employee();
		
		obj.setId(101);  
		System.out.println("Employee ID : " + obj.getId());
		
		obj.setName("Anisha Madhu");  
		System.out.println("Employee Name : " + obj.getName());
		
		obj.setAge(25);  
		System.out.println("Employee Age : " + obj.getAge());
		
		obj.setSalary(50000.00f);  
		System.out.println("Employee Salary : " + obj.getSalary());
			
	}

}
