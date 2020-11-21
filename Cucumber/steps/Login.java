package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{

	
	/*
	 * @Given("launch the Chrome Browser") public void openChromeBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize(); }
	 * 
	 * @Given("load the application url") public void loadApplication() {
	 * driver.get("http://leaftaps.com/opentaps/control/main");
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * 
	 * }
	 */
	
	@Given("Enter the username as (.*)")
	public void enterUsername(String username) {
		driver.findElementById("username").sendKeys(username);

	}
	
	@Given("Enter the password as (.*)")
	public void enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);

	}
	
	@When("click on login button")
	public void clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();

	}
	
	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		System.out.println("homepage displayed");

	}
	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error message is displayed");
	}
	
	
	/*
	 * @Given("enter username as (.*) and password as (.*)") public void
	 * enterCredentials(String username , String password) {
	 * driver.findElementById("username").sendKeys(username);
	 * driver.findElementById("password").sendKeys(password);
	 * 
	 * }
	 */
	
	
	
	
	
	
	
}
