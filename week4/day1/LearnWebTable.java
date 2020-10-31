package week4.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		
		int rowCount = driver.findElementsByXPath("//table[@id='table_id']//tr").size();
				
		
		for (int i = 2; i <= rowCount; i++) {
			
			int cellCount = driver.findElementsByXPath("//table[@id='table_id']//tr["+i+"]/td").size();
			
			for (int j = 1; j <= cellCount; j++) {
				
				String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
				System.out.println(text);
			}
			
		}
		
		
		//driver.findElementById("fromStation").sendKeys(Keys.TAB);
		

	}

}
