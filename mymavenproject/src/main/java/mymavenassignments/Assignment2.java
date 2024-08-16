//Write a program to check whether the candidate is eligible for Voting(Use static method and boolean return type).

package mymavenassignments;

public class Assignment2 {	
	
    public static boolean voting(int age) {
        if (age >= 18) {
            return true;  
        } else {
            return false; 
        }
    }
    public static void main(String[] args) {
   
        boolean isEligible = Assignment2.voting(25);

        if (isEligible == true) {
            System.out.println("The candidate is eligible for voting.");
        } else {
            System.out.println("The candidate is not eligible for voting.");
        }
    }

}
