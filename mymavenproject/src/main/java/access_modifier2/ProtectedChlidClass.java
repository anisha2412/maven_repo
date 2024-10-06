package access_modifier2;

import access_modifiers.Protected1;  // import 

public class ProtectedChlidClass extends Protected1{

	public static void main(String[] args) {
		ProtectedChlidClass obj = new ProtectedChlidClass();  // create obj for child , because of applying inheritance
		obj.show();   // get output

	}

}
