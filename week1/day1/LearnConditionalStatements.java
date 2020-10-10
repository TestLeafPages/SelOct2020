package week1.day1;

public class LearnConditionalStatements {

	public static void main(String[] args) {
		
		int age = 20;
		
		
		if(age < 18) {
			System.out.println("minor");
		}
		else if (age >= 18 && age < 60) {
			System.out.println("adult");
		}
		else if(age >= 60 ) {
			System.out.println("Senior Citizen");
		}
		
		/*
		 * if(age > 17) { System.out.println("adult"); } else {
		 * System.out.println("minor"); }
		 */
		
		
	}

}
