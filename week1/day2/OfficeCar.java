package week1.day2;

import week1.day1.Car;

public class OfficeCar {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.driveCar();
		myCar.applyBrake();
		
		System.out.println(myCar.carPrice);
		
	}

}
