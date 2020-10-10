package week1.day1;

//accessSpecifier class ClassName{}
public class Car {
	
	 String brandName = "Hyundai";
	 int numWheels = 4;
	 boolean isPuncture = false;
	 char fuelType = 'P';
	 double carPrice = 800000.324324;
	

	// accessSpecifier returnType methodName(){}
	public void driveCar() {
		String driverName = "Hari";
		System.out.println("Driving car");
		System.out.println(driverName);
		
	}

	public void applyBrake() {
		System.out.println("Applied brake");
		//System.out.println(carPrice);
		
		int numOfWheels = numWheels;

	}

	public static void main(String[] args) {

		// ClassName objectName = new ClassName()
		Car myCar = new Car();

		myCar.driveCar();
		myCar.applyBrake();
		
		
		
		int noOfWheel = myCar.numWheels;
		
		System.out.println(noOfWheel);
		
		System.out.println(myCar.brandName);
		System.out.println(myCar.carPrice);
		System.out.println("Check whether my mobile id fully chrged "+myCar.isPuncture);
		
		
	
		
		
		
		

	}

}
