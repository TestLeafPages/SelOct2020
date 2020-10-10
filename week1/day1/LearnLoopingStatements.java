package week1.day1;

public class LearnLoopingStatements {

	public static void main(String[] args) {
		
		//intial value ; condition ; increment / decrement
		// i++  i = i+1;
		/*
		 * for(int i = 1 ; i <= 10 ; i++) {
		 * 
		 * System.out.println(i);
		 * 
		 * }
		 */
		
		/*
		 * for(int i = 1 ; i <= 10 ; i++) {
		 * 
		 * if(i % 2 == 0) {
		 * 
		 * System.out.println(i); }
		 * 
		 * 
		 * 
		 * }
		 */
		
		
		
		for (int i = 1; i <= 10; i++) {
			
			if(i == 3) {
				System.out.println("Three");
				break;
				//continue;
			}
			
			System.out.println(i);
			
		}
		
		
		
		
		
		

	}

}
