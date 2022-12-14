package s1_6_niv3_ex1_montseliz;

public class Smartphone implements Telephone {

	private String brand; 
	private int number; 
	
	public Smartphone() {
	}
	
	public Smartphone(String brand, int number) {
		this.brand = brand; 
		this.number = number; 
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public void call() {
		System.out.println("S'està trucant al número " + this.number + "."); 
	}
	
	public void takePhotos() {
		System.out.println("S'està fent una fotografia amb l'smartphone de la marca " + this.brand + ".");
	}

	@Override
	public String toString() {
		return "Smartphone [brand=" + brand + ", number=" + number + "]";
	}
	
	

}
