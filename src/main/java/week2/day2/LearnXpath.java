package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		//to setup chrome driver
		WebDriverManager.chromedriver().setup();
		
		String property = System.getProperty("webdriver.chrome.driver");
		
		System.out.println(property);
					
		//To open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
						
		//to maximize the browser
		driver.manage().window().maximize();
					
		//to load application url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementByXPath("//input").sendKeys("demosalesmanager");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
