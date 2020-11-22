package testng.day3;

import org.testng.annotations.Test;

public class RandomFailure {
	
	@Test(timeOut = 500)
	public void testCase1() throws InterruptedException {
		
		int ranNum = (int) (Math.random()*1000);
		System.out.println(ranNum);
		Thread.sleep(ranNum);
		

	}

}
