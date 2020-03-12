package lab12;
//Author:Jackie Zablah. Java Bootcamp
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numberOfCars = 0;
		String make;
		String model;
		int year;
		double price;

		ArrayList<Car> CarInventory = new ArrayList<Car>();


		System.out.println("Welcome to the Detroit Delership admin console!");
		System.out.print("How many cars are you entering? or (Type 0 to exit)");
		
		numberOfCars = Validator.getInt(scnr);

		int counter = 1;
		do {
			Car Inventory = new Car();	

			for (int i = 0; i < (numberOfCars - 1); i++) {
				System.out.print("Enter Car #" + counter + " Make: " );
				make = scnr.next();
				Inventory.setMake(make);
				System.out.print("Enter Car #" + counter + " Model: " );
				model = scnr.next();
				Inventory.setModel(model);
				System.out.print("Enter Car #" + counter + " Year: " );
				year = Validator.getInt(scnr);
				Inventory.setYear(year);
				System.out.print("Enter Car #" + counter + " Price: " );
				price = Validator.getDouble(scnr);
				Inventory.setPrice(price);
				System.out.println();

				CarInventory.add(i, Inventory); 
			}//end for
			counter++;
		}
		while(counter<=numberOfCars);

		System.out.println("Current Inventory");
		if (numberOfCars == 0) {
			System.out.println("No cars stored. Good Bye.");
		}
		else {
			for (int i = 0; i<CarInventory.size(); i++) {
				System.out.println(CarInventory.get(i).toString());
			}
		}
		scnr.close();
	}//end main

}//end CarApp class
