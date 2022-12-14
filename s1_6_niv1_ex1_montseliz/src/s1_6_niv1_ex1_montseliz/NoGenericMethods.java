package s1_6_niv1_ex1_montseliz;

public class NoGenericMethods {
 
	private String name1; 
	private String name2; 
	private String name3; 
	
	public NoGenericMethods() {
		this.name1 = ""; 
		this.name2 = ""; 
		this.name3 = ""; 
	}
	
	public NoGenericMethods(String name1, String name2, String name3) {
		this.name1 = name1; 
		this.name2 = name2;
		this.name3 = name3; 
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	@Override
	public String toString() {
		return "NoGenericMethods [name1=" + name1 + ", name2=" + name2 + ", name3=" + name3 + "]";
	}

	
	
	
	
}
