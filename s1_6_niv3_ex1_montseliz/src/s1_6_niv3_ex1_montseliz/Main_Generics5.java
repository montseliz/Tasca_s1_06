package s1_6_niv3_ex1_montseliz;

public class Main_Generics5 {

	public static void main(String[] args) {
		
	Smartphone smartphone = new Smartphone("Iphone", 639828834);
	
	Generic.genericTelephone(smartphone);
	System.out.println("");
	Generic.genericSmartphone(smartphone);
	// El mètode limitat per la interfície Telephone només pot cridar al mètode abstracte call()
		
	}

}
