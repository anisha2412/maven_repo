//hierarchial_inheritance

//Rose -> Jasmin , Flower -> Jasmin [ Jasmin + Rose ]

package hierarchial_inheritance;

public class Flower extends Jasmin{
	
	public void flowerdisplay() {
		System.out.println("This class is for flowers it extends Jasmin ");
	}
		
	public static void main(String[] args) {
				
		Flower obj = new Flower();
		obj.flowerdisplay();
		//obj.roseflower();
		obj.jasminflower();		
		
		Jasmin obj1 = new Jasmin();		
		obj1.roseflower();
	}

}
