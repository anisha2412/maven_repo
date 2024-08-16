// Write a program to find the :
// * Average of three integer numbers, three float numbers(should have same method name)  
// * Area of figures(circle, rectangle, square) by using three methods(should have same method name)

package mymavenassignments;

public class Assignment4 {
		
	public void average(int a, int b, int c) {		
		int average = a +b+c/3;
		System.out.println("Average of 3 integer numbers : " + average);
	}
		
	public void average(float a, float b, float c) {
		float average = a +b+c/3;
		System.out.println("Average of 3 float numbers : " + average);
	}
	
	public void area(float a) {		
		double circle_area = 3.14 * a * a;                           // A = πr2 = 3.14 * r2
		System.out.println("Area of circle : " + circle_area);
	}
		
	public void area(float a, int b) {                                    // A = l * b
		float rectangle_area = a * b;
		System.out.println("Area of rectangle : " + rectangle_area);
	}
	
	public void area(int a) {		                                    // A = a * a
		int square_area = a * a;
		System.out.println("Area of square : " + square_area);
	}
		
	public static void main(String[] args) {		
		Assignment4 obj= new Assignment4();
		obj.average(3,4,6);
		obj.average(5.5f,3.5f,8.6f);	
		
		obj.area(4.2f);
		obj.area(10.5f,15);
		obj.area(5);
	}

}
