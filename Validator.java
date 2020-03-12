package lab12;

import java.util.Scanner;

public class Validator {
	/**
	 * Get any valid integer.
	 */
	public static int getInt(Scanner scnr) {
		
		while (!scnr.hasNextInt()) {
			scnr.nextLine(); // clear bad line.
			System.out.println("Sorry, I can't read that. Enter a whole number, using digits.");
			
		}
		int result = scnr.nextInt();
		scnr.nextLine(); // clear for next line of input.
		return result;
	}

	/**
	 * Get any valid double.
	 */
	public static double getDouble(Scanner scnr) {
		// This approach use "hasNext" look ahead.
		boolean isValid = false;
		do {
			isValid = scnr.hasNextDouble();
			if (!isValid) {
				scnr.nextLine(); // clear bad line.
				System.out.println("Sorry, I can't read that. Enter a number, using digits.");
			}
		} while (!isValid);
		
		double number = scnr.nextDouble();
		scnr.nextLine(); // clear for next line of input.
		return number;
	}
	
		
}