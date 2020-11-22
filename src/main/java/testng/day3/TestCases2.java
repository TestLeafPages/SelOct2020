package testng.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestCases2 {
	
	@Test//(retryAnalyzer = RetryFailedTestcases.class)
	public void createLead() {
		System.out.println("create lead");
		//throw new NoSuchElementException();

	}
	
	@Test
	public void editLead() {
		System.out.println("edit lead");

	}
	
	@Test
	public void deleteLead() {
		System.out.println("delete lead");

	}
	
	@Test
	public void duplicateLead() {
		System.out.println("duplicate lead");

	}

}
