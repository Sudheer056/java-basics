package javaBasics;

import java.util.Scanner;

public class Scaner_Class {

	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);
		int ID = 878981;
		while (true) {
			System.out.println("Enter your ID number: ");
			int id = scanner.nextInt();

			if (ID == id) {
				System.out.println("ID matches");
				break;
			}

		}
		
		System.out.println("name".equalsIgnoreCase("hi"));
		System.out.println("name".equalsIgnoreCase("Name"));
        
		// Close the scanner to prevent resource leak
		scanner.close();
	}

}
