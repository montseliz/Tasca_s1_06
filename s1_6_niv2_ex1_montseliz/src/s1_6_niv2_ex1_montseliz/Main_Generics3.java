package s1_6_niv2_ex1_montseliz;

public class Main_Generics3 {

	public static void main(String[] args) {
		Person person1 = new Person ("Montse", "Liz", 30);
		Person person2 = new Person ("Alex", "Casas", 38);
		GenericMethods<Object> generic1 = new GenericMethods<Object>(); 
		
		generic1.genericMethod(40, "Martínez", person1);
		System.out.println(" ");
		generic1.genericMethod(50, 23, person2);
		
		
	}
}
