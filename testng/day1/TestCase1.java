package testng.day1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 extends SuperClass {
	
	/*
	 * @BeforeMethod public void beforeMethod() {
	 * System.out.println("Before method in testcase1");
	 * 
	 * }
	 */
	
  @Test
  public void test1() {
	  System.out.println("test1");
  }
}
