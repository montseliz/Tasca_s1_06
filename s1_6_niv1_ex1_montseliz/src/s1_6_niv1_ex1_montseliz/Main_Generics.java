package s1_6_niv1_ex1_montseliz;

public class Main_Generics {

	public static void main(String[] args) {
		
		NoGenericMethods obj1 = new NoGenericMethods ("Montse", "Anna", "Marc");
		
		System.out.println(obj1.toString()); 
		
		obj1.setName1("Marc");
		obj1.setName2("Montse");
		obj1.setName3("Anna");
		
		System.out.println(obj1.toString()); 
		
		NoGenericMethods obj2 = new NoGenericMethods ();
		
		obj2.setName1("Anna");
		obj2.setName2("Marc");
		obj2.setName3("Montse");
		
		System.out.println(obj2.toString());
		
		
		
	}

}
