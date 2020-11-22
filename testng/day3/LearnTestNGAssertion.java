package testng.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTestNGAssertion {
	
	@Test
	public void createLead() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		boolean loginState = driver.findElementByClassName("decorativeSubmit").isEnabled();
		
		//Create object for SoftAssert
		SoftAssert softAssert = new SoftAssert();
		
		//Assert.assertTrue(loginState);
		
		//assertion1
		//Assert.assertFalse(loginState);
		softAssert.assertFalse(loginState);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//assertion2
		//Assert.assertEquals(title, "Leaftaps - TestLeaf Automation Platform");
		
		softAssert.assertEquals(title, "Leaftaps - TestLeaf Automation Platform");
		
		
		/*
		 * if(title.equals("TestLeaf - OpenTaps")) { System.out.println("test pass"); }
		 * else { System.out.println("test fail"); }
		 * 
		 */
	
		softAssert.assertAll();

	}

}
