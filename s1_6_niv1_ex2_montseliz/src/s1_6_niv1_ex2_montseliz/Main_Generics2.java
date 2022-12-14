package s1_6_niv1_ex2_montseliz;

public class Main_Generics2 {

	public static void main(String[] args) {
		
		Person person1 = new Person ("Montse", "Liz", 30);
		Person person2 = new Person ("Alex", "Casas", 38);
		GenericMethods<Object> generic1 = new GenericMethods<Object>(); 
		
		generic1.genericMethod(person1, "Martínez", 28);
		System.out.println(" ");
		generic1.genericMethod("Pol", 23, person2);
		
		
	}

}
