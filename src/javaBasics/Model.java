package javaBasics;

public class Model {

	int i = 8;
	static int j = 4;

	public static void main(String[] args) {

		Model M = new Model();
		int k = 2;

		System.out.println("k+j = " + (k + j));
		System.out.println(M.i + j);
		M.instanace();

	}

	private void instanace() {

		System.out.println("i+j = " + (i + j));

	}
}
