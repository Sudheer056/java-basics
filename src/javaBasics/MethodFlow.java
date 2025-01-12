package javaBasics;

public class MethodFlow {

	public static void main(String[] args) {
		MethodFlow j = new MethodFlow();
		System.out.println(j.addition());
		System.out.println(name());
	}

	// return statement
	private int addition() {
		System.out.println("addition method");
		return 20 + 30;
	}

	private static String name() {
		System.out.println("name method");
		MethodFlow j = new MethodFlow();
		System.out.println("calling addition() method in the name() method");
		System.out.println(j.addition());
		return "some name";
	}
}
