package javaBasics;

public class Loops {

	public static void main(String[] args) {

		// for loop
		// while loop
		// do while loop

		// syntax: for(initial value; condition; value increment/decrement){}

		for (int i = 0; i <= 2; i++) 
			System.out.println("hello");
			System.out.println("Hi");
		
		System.out.println("*** for loop ended ***");

		// syntax: while(condition){ }

		int i = 0;
		while (i <1) {
			System.out.println("hello");
			System.out.println("Hi");
			i++;
		}

		System.out.println("*** while loop ended ***");

		// syntax: do {value increment/ decrement} while(condition);
		int j = 3;
		do {
			System.out.println("hello");
			System.out.println("Hi");
			j++;
		} while (j <= 2);

	}

}
