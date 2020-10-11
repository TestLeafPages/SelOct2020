package week1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
//sum of each digit cube
		
		int input = 153;
		
		int res = 0;
		
		int rem;
		
		int original = input;
		
		while(input > 0) {
			
			rem = input % 10 ;
			
			res = res + (rem*rem*rem);
			
			input = input / 10 ;
			
		}
		
		if(original == res) {
			System.out.println("Given number is armstrong");
		}
		else {
			System.out.println("Given number is not armstrong");
		}
		
		
		
		
		
		

	}

}
