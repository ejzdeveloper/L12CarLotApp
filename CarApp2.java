package lab12;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userChoice;
		String userBuy;


		ArrayList<Car> CarsInventory = new ArrayList<Car>();
		CarsInventory.add(new Car("Tesla", "S Perfor", 2020, 116000.00));
		CarsInventory.add(new Car("Ferrari", "LaFerrari", 2020, 45000.00));
		CarsInventory.add(new Car("Porche", "Cayenne", 2020, 75000.00));
		CarsInventory.add(new Car("Jeep", "Gladiator", 2020, 35000.00));
		CarsInventory.add(new Car("Ford", "Mustang", 2020, 27000.00));
		CarsInventory.add(new Car("Jeep", "Wranglers", 2020, 25000.00));
		CarsInventory.add(new Car("Toyota", "Sienna XLE", 2020, 40000.00));
		CarsInventory.add(new UsedCar("Nissan", "Rouge", 2018, 17000.00, 42000.00));
		CarsInventory.add(new UsedCar("Jeep", "Wranglers", 2007, 9000.00, 120000.00));
		CarsInventory.add(new UsedCar("BMW  ", "X3     ", 2010, 12000.00, 130000.00));
		CarsInventory.add(new UsedCar("Subaru", "Legacy", 2010, 5000.00, 145000.00));

		System.out.println("Welcome to Rolling Wheels Motors App: \n");

		do {
			for (int i = 1; i<CarsInventory.size(); i++) {
				System.out.println(i + ". " + CarsInventory.get(i-1).toString());
			}
			System.out.println((CarsInventory.size() + 1) +  ". Quit");
			System.out.print("\nWhich car would you like? ");
	         userChoice = Validator.getInt(scnr);
	         try{
	            System.out.println(CarsInventory.get(userChoice-1));
	            System.out.print("Would you like to buy this car? (Y/N) ");
	            userBuy = scnr.next();
	            if(userBuy.equalsIgnoreCase("y")){
	            	CarsInventory.remove(userChoice-1);
	               System.out.println("\nExcellent! Our finance department will be in touch shortly.\n");
	               userChoice=0;
	            }//end if
	         }//end try
	         catch(IndexOutOfBoundsException e){}//end catch
	      }//end do
	      while(userChoice!=(CarsInventory.size()+1));
	      
	      System.out.println("Thanks for using the App, Have a great day!");
		scnr.close();
	}//end main

}//end CarApp2
