package testng.day1;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	//public static String leadId;

	@Test
	public void createLead() {
		System.out.println("Create Lead");
	//	leadId = "123";

	}

	/*
	 * @Test public void editLead() { System.out.println("Edit Lead");
	 * 
	 * }
	 * 
	 * @Test(dependsOnMethods = {"createLead","editLead"}) public void deleteLead()
	 * { System.out.println("Delete Lead"); System.out.println(leadId);
	 * 
	 * }
	 */

}
