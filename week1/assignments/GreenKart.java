package week1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GreenKart {

	public static void main(String[] args) {
		//Setup the driver
		WebDriverManager.chromedriver().setup();
		//initialize the chrome driver
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Increase the quantity and Add to Cart
		for (int i = 1; i <= 6; i++) {
			driver.findElementByXPath("(//div[@class='product'])["+i+"]//a[2]").click();
			driver.findElementByXPath("(//div[@class='product'])["+i+"]//button").click();
		}
		//Click on Cart
		driver.findElementByXPath("//img[@alt='Cart']").click();
		//Remove one item from cart
		driver.findElementByXPath("//a[@class='product-remove']").click();
		//Click Proceed to checkout
		driver.findElementByXPath("//button[text()='PROCEED TO CHECKOUT']").click();
		//Place the order
		driver.findElementByXPath("//button[text()='Place Order']").click();
		
		//Select Country	
		Select dropDown = new Select(driver.findElementByXPath("//select"));
		dropDown.selectByVisibleText("India");
		
		//Agree terms
		driver.findElementByXPath("//input[@class='chkAgree']").click();
		//Click Proceed
		driver.findElementByXPath("//button[text()='Proceed']").click();
		

	}

}
