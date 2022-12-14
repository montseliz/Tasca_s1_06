package s1_6_niv2_ex2_montseliz;

import java.util.ArrayList;
import java.util.Arrays;

public class Main_Generics4 {

	public static void main(String[] args) {
		Person person1 = new Person ("Montse", "Liz", 30);
		Person person2 = new Person ("Alex", "Casas", 38);
		GenericMethods<Object> generic1 = new GenericMethods<Object>(); 
		ArrayList<Object> arrayGeneric = new ArrayList<Object>(Arrays.asList("one", 2, "three", 4.5, person1, person2)); 
		
		generic1.genericMethod(arrayGeneric);
	
		
	}

}
