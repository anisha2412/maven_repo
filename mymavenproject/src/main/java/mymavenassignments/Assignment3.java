// Write a program to find the grade of 2 students based on total marks(3 subjects) :
// * Get the students marks by constructor 
// * Return total mark to in main method 
// * Find the grade of each student.

package mymavenassignments;

public class Assignment3 {
	
	int php ;         // instance variables
	int java ;
	int python;	
	
	public Assignment3(int php, int java, int python) { // constructor		
		 this.php =php;
		 this.java = java;
		 this.python = python;			
	}
	
	public int totalMark() {           // instance method 		
		int total = php + java + python;	
		return total;		
	}

    public char getGrade() {
        int tot_mark = totalMark();

        if (tot_mark >= 90) {
        	return 'A';
        }
        else if (tot_mark >= 80) {
        	return 'B';
        }
        else if (tot_mark >= 70) {
        	return 'C';
        }
        else  if (tot_mark >= 60) {
        	return 'D';
        }       
        else {
        	return 'F';
        }
    }

	public static void main(String[] args) {		
		Assignment3 obj = new Assignment3(20,30,45);	
		Assignment3 obj1 = new Assignment3(15,35,20);
        System.out.println("Student 1 - Total Marks: " + obj.totalMark() + ", Grade: " + obj.getGrade());
        System.out.println("Student 2 - Total Marks: " + obj1.totalMark() + ", Grade: " + obj1.getGrade());
	}

}
