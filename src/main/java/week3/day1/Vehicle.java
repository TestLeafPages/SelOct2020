package week3.day1;

public class Vehicle {
	
	String brand = "Hyundai";
	
	public void applyBrake() {
		System.out.println("applied brake - from vehicle");

	}
	
	public void soundHorn() {
		System.out.println("sound horn");

	}
	
	public static void main(String[] args) {
		
		Vehicle veh = new Vehicle();
		
		veh.applyBrake();
		
		
	}
	

}
