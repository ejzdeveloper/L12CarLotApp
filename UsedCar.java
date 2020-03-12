package lab12;
//Author:Jackie Zablah. Java Bootcamp
public class UsedCar extends Car {
	private double mileage;
	
	public UsedCar() {};

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
		
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-10s %-7d $%,.2f (used) %,.2f miles", getMake(), getModel(), getYear(), getPrice(), mileage);
	}
	
	

}//end CsedCar
