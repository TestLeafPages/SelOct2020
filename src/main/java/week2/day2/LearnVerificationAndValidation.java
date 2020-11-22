package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnVerificationAndValidation {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//to setup chrome driver
		WebDriverManager.chromedriver().setup();
		
		//to set up firefox driver
		//WebDriverManager.firefoxdriver().setup();
		
		//To open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// to open FireFox browser
		//FirefoxDriver driver = new FirefoxDriver();
				
		//to maximize the browser
		driver.manage().window().maximize();
		
		//new feature available from Selenium4 to minimize the window.
		//driver.manage().window().minimize();
			
		//to load application url
		/*driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String text = driver.findElementByPartialLinkText("Forgotten").getText();
		
		System.out.println(text);*/
		
		
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  
		  String text = driver.findElementByTagName("h2").getText();
		  
		  System.out.println(text);
		  
		//  String attribute = driver.findElementById("username").getAttribute("type");
		  
		/*
		 * boolean displayed = driver.findElementById("username").isDisplayed();
		 * 
		 * System.out.println(displayed);
		 */
		  //isEnbled()
		  
		  //isSelected()
		 
		
		/*
		 * driver.get("https://www.calculator.net/loan-calculator.html");
		 * 
		 * String attribute =
		 * driver.findElementById("cloanamount").getAttribute("value");
		 * 
		 * System.out.println(attribute);
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
