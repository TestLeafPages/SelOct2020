package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToInteractMultipleElements {

	public static void main(String[] args) {
		
		
			
				WebDriverManager.chromedriver().setup();
				
				ChromeDriver driver = new ChromeDriver();
				
				
				driver.manage().window().maximize();
				
				
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				List<WebElement> inputLogin = driver.findElementsByClassName("inputLogin");
				
				for (WebElement webElement : inputLogin) {
					
					System.out.println(webElement.getAttribute("id"));
					
				}
				
				
				
		/*
		 * List<WebElement> inputs = driver.findElementsByTagName("input");
		 * 
		 * int size = inputs.size();
		 * 
		 * System.out.println(size);
		 * 
		 * for (WebElement eachElement : inputs) {
		 * 
		 * System.out.println(eachElement.getAttribute("name"));
		 * 
		 * }
		 */
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
