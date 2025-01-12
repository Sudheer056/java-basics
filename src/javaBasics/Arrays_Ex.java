package javaBasics;

public class Arrays_Ex {

	public static void main(String[] args) {

		// Syntax: dataType reference[] = new dataType[ArrayCapacty];
		
		String a[] = new String[10];
		System.out.println("array length: " + a.length);
		a[0] = "core java";
		a[1] = "Advanced java";
		a[2] = "python";
		a[3] = "C++";

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null)
				System.out.println(a[i] + " available at index: "+i);
		}
	}
}
