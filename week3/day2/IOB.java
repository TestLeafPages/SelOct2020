package week3.day2;

public class IOB implements RBI,FinanceMinistry {

	public void agriLoan() {
		System.out.println("Agri loan");

	}
	
	public void minBalance() {

		System.out.println("5000");

	}

	public void maxLoanAmount() {

		System.out.println("100000");
	}
	
	public static void main(String[] args) {
		
		IOB iob = new IOB();
		
		iob.minBalance();
		iob.maxLoanAmount();
		iob.agriLoan();
		iob.emergencyLoanForCovid();
		iob.floodReliefFund();
		
		
		
		
	}

	public void emergencyLoanForCovid() {
		System.out.println("emergency loan");
		
	}

	public void floodReliefFund() {
		System.out.println("flood relief fund");
		
	}
	

}
