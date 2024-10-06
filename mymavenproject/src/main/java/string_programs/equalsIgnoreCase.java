package string_programs;

public class equalsIgnoreCase {

	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		String s3="JAVA";
		String s4="Python";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s3)); // check only content,ignore case sensitivity
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s1.equalsIgnoreCase(s4));

	}

}
