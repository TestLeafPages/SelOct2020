package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

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
		
		//to locate the element using Id locator
		WebElement username = driver.findElementById("username");
		
		//type a value in a webelement
		username.sendKeys("demosalesmanager");
		
		//to type password in the password text field using id locator
		//driver.findElementById("password").sendKeys("crmsfa");
		
		//locate element using name locator
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		//to click on the login button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//linkText locator for the html link elements(in <a> tag)
		driver.findElementByLinkText("CRM/SFA").click();
		
		//locate using link text
		driver.findElementByLinkText("Leads").click();
		
		
		driver.findElementByLinkText("Create Lead").click();
		
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dropDown = new Select(source);
		
		// to select using visible text
	//	dropDown.selectByVisibleText("Employee");
		
		//to select using value
		//dropDown.selectByValue("LEAD_PARTNER");
		
		//select using index
		dropDown.selectByIndex(1);
		
		
		WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select dropDown1 = new Select(marketingCampaign);
		
		dropDown1.selectByVisibleText("Automobile");
		
		
		
		
		
		
		
		
		
		
		/*
		 * driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		 * 
		 * 
		 * driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
		 * 
		 * 
		 * driver.findElementById("createLeadForm_lastName").sendKeys("R");
		 * 
		 * 
		 * driver.findElementByName("submitButton").click();
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
