package week3.day1;

import java.util.Scanner;

public class GetUserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the first number");
		
		int x = scan.nextInt();

		System.out.println("enter the second number");
		
		int y = scan.nextInt();
		
		System.out.println("sum of given values");
		
		System.out.println(x+y);
	}

}
