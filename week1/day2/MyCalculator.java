package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(10, 20, 30));
		System.out.println(calc.sub(20, 10));
		System.out.println(calc.mul(342323.234234, 564566.867876));
		System.out.println(calc.divide(25.35f, 12.12f));

	}

}
