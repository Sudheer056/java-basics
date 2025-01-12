package javaBasics;

public class Condition {

	public static void main(String[] args) {

//		if(condition) {
//			execute the code
//		}

		int i = 0;

		if (i <= 1) {
			System.out.println("I am in if block");
			i++;
		}

		System.out.println("i value: " + i);

//		if(condition) {
//			execute the code
//		} else { execute the code} 

		int j = 11;

		if (j < 10) {
			System.out.println("I am inside a if block of if-else");
		} else {
			System.out.println("I am inside a else block of if-else");
		}

//		if(condition) {
//			execute the code
//		}else if(condition){execute the code}else{}

		int z = 50;

		if (z < 22) {
			System.out.println("I am inside a if block of if-else if");

		} else if (z < 40) {
			System.out.println("I am inside a else if block of if-else if");
		} else {
			System.out.println("I am inside a else block of if-else if");
		}

		System.out.println("*** switch case started ***");

		String colour = "blue";

		switch (colour) {
		case "red":
			System.out.println("red colour");
			break;
		case "blue":
			System.out.println("blue colour");
			break;
		case "green":
			System.out.println("green colour");
			break;
		default:
			System.out.println("colour not identified");
		}
		;

	}

}
