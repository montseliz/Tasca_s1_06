package s1_6_niv2_ex2_montseliz;

import java.util.ArrayList;

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
	
	public void genericMethod(ArrayList <T> arrayGeneric) {
		for (T t : arrayGeneric) {
			System.out.println(t);
		}
	}

	@Override
	public String toString() {
		return "GenericMethods [one=" + one + ", two=" + two + ", three=" + three + "]";
	}
	
	
}
