package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

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
		driver.get("https://www.facebook.com/");
				
		Thread.sleep(3000);
		
	//	driver.findElementByPartialLinkText("Forgotten").click();
		
		//to close the browser
	//	driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
