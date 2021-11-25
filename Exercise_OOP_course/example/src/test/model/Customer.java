package test.model;

public class Customer {

	static int value = 1;
	
	Customer() {
		
	}

	public static void main(String... args) {

		Custom1 c1 = new Custom1();
		Custom2 c2 = new Custom2();
		
		c2.value = 3;
		System.out.println(value);
		
		Customer.value = 4;
		System.out.println(Customer.value);
	}
}
