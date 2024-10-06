package review_1;

public class ArithemeticExcep {

	public static void main(String[] args) {
		
		try {
			int num = 10/0;			
		}
		
		catch(ArithmeticException e) {
			System.out.println("Division by Zero is not possible!!");
			
		}

	}

}
