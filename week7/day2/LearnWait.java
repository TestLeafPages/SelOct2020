package week7.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/TextChange.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.textToBe(By.id("btn"), "Click ME!"));
		
		driver.findElementById("btn").click();
		
		
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElementById("btn")));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn")));
		
		
		//String text = driver.findElementById("btn").getText();
		
		//System.out.println(text);
		
		/*
		 * WebElement eleToBeDisappeared =
		 * driver.findElementByXPath("//*[contains(text(),'Keep looking at me')]");
		 * 
		 * //Explicitly Wait WebDriverWait wait = new
		 * WebDriverWait(driver,Duration.ofSeconds(1));
		 * 
		 * //Giving the condition to wait
		 * wait.until(ExpectedConditions.invisibilityOf(eleToBeDisappeared));
		 * 
		 * String text =
		 * driver.findElementByXPath("//div[@id='show']//strong").getText();
		 * System.out.println(text);
		 */
		
		
	}

}
