package testng.day1;

import org.testng.annotations.Test;

public class LearnTestngAttributes {
	
	@Test(dependsOnMethods = "testcase.LearnAttributes.createLead")
	public void duplicateLead() {
		System.out.println("duplicate lead");

	}

}
