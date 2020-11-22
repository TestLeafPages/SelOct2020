package testng.day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 extends SuperClass {
	/*
	 * @BeforeClass public void beforeClass() {
	 * System.out.println("Before class in testcase2");
	 * 
	 * }
	 * 
	 * @BeforeMethod public void beforeMethod() {
	 * System.out.println("Before method in testcase2");
	 * 
	 * }
	 */
	
	
  @Test
  public void test2() {
	  System.out.println("test2");
  }
}
