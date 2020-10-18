package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelect {

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
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		driver.findElementByXPath("(//option[text()='Selenium'])[6]").click();
		
		/*
		 * WebElement comboBox = driver.findElementByXPath("(//select)[6]");
		 * 
		 * Select multiSelect = new Select(comboBox);
		 * 
		 * multiSelect.selectByVisibleText("Selenium");
		 * multiSelect.selectByVisibleText("Appium");
		 * 
		 * Thread.sleep(2000); multiSelect.deselectByVisibleText("Selenium");
		 */
		
		
		
		
		/*
		 * //to locate the element using Id locator WebElement username =
		 * driver.findElementById("username");
		 * 
		 * //type a value in a webelement username.sendKeys("demosalesmanager");
		 * 
		 * //to type password in the password text field using id locator
		 * //driver.findElementById("password").sendKeys("crmsfa");
		 * 
		 * //locate element using name locator
		 * driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		 * 
		 * //to click on the login button
		 * driver.findElementByClassName("decorativeSubmit").click();
		 * 
		 * //linkText locator for the html link elements(in <a> tag)
		 * driver.findElementByLinkText("CRM/SFA").click();
		 * 
		 * //locate using link text driver.findElementByLinkText("Leads").click();
		 * 
		 * 
		 * driver.findElementByLinkText("Create Lead").click();
		 * 
		 * //locate the select(parent tag) WebElement source =
		 * driver.findElementById("createLeadForm_dataSourceId");
		 * 
		 * //pass the webelement to the select class Select dropDown = new
		 * Select(source);
		 * 
		 * //collection of items(WebElements) List<WebElement> options =
		 * dropDown.getOptions();
		 * 
		 * //select the second last Element from the dropDown
		 * options.get(options.size()-2).click();
		 */
		
		
		/*
		 * for (WebElement eachElement : options) {
		 * System.out.println(eachElement.getText()); eachElement.click(); }
		 */
		
		/*
		 * int size = options.size();
		 * 
		 * for (int i = 1; i < options.size(); i++) {
		 * 
		 * //to get the last item WebElement eachElement = options.get(i); String text =
		 * eachElement.getText();
		 * 
		 * System.out.println(text);
		 * 
		 * eachElement.click();
		 * 
		 * 
		 * 
		 * }
		 */
		
		
		
		//to get the count
		//System.out.println(options.size());
		
		
		
		
		// to select using visible text
	//	dropDown.selectByVisibleText("Employee");
		
		//to select using value
		//dropDown.selectByValue("LEAD_PARTNER");
		
		//select using index
	//	dropDown.selectByIndex(1);
		
		
		
		  WebElement marketingCampaign =
		  driver.findElementById("createLeadForm_marketingCampaignId");
		  
		  Select dropDown1 = new Select(marketingCampaign);
		  
		  dropDown1.selectByIndex(2);
		 
		
		
		
		
		
		
		
		
		
		
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
