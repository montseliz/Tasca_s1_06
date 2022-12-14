package s1_6_niv3_ex1_montseliz;

public class Generic <T> {

	public static <T extends Telephone> void genericTelephone(T t) {
		t.call();
		// No es pot cridar el mètode takePhotos()
	}
	
	public static <T extends Smartphone> void genericSmartphone(T t) {
		t.call();
		t.takePhotos(); 
	}
}
