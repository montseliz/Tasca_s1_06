package s1_6_niv1_ex2_montseliz;

public class GenericMethods <T> {

	private T one; 
	private T two; 
	private T three;
	
	public GenericMethods() {
		one = null; 
		two = null; 
		three = null; 
	}

	public T getOne() {
		return one;
	}

	public void setOne(T one) {
		this.one = one;
	}

	public T getTwo() {
		return two;
	}

	public void setTwo(T two) {
		this.two = two;
	}

	public T getThree() {
		return three;
	}

	public void setThree(T three) {
		this.three = three;
	}
	
	public void genericMethod(T one, T two, T three) {
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}

	@Override
	public String toString() {
		return "GenericMethods [one=" + one + ", two=" + two + ", three=" + three + "]";
	}
	
	
}
