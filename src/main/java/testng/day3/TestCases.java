package testng.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestCases {
	
	@Test(groups = {"smoke"})
	public void createLead() {
		System.out.println("create lead");
		throw new NoSuchElementException();

	}
	
	@Test(groups = {"smoke"})
	public void editLead() {
		System.out.println("edit lead");

	}
	
	@Test(groups = {"regression"}, dependsOnGroups = {"smoke"})
	public void deleteLead() {
		System.out.println("delete lead");

	}
	
	@Test(groups = {"regression"},dependsOnGroups = {"smoke"})
	public void duplicateLead() {
		System.out.println("duplicate lead");

	}

}
