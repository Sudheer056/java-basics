package javaBasics;

public class JumpStatements {

	public static void main(String[] args) {

		// continue jump statement
		for (int i = 0; i <= 5; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("break statement started");

		// break statement
		for (int i = 0; i <= 5; i++) {
			if (i == 3) {
				System.out.println("loop terminated due to break statement.");
				break;
			}
			System.out.println(i);
		}

		System.out.println(name());

	}

	// return statement
	private int addition() {
		System.out.println("addition method");
		return 20 + 30;
	}

	private static String name() {
		System.out.println("name method");
		JumpStatements j = new JumpStatements();
		System.out.println("calling addition() method in the name() method");
		System.out.println(j.addition());
		return "some name";
	}

}
// Iterate the loop until name matches specified name 