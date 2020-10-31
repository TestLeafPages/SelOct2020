package week4.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUI {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		
		//to get inside frame
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElementById("draggable");
		
		
		
		
	//	WebElement target = driver.findElementById("droppable");
		
		
		
		//WebElement selenium = driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[1]");
		//WebElement appium = driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[2]");
		
		//WebElement men = driver.findElementByLinkText("Men");
		
		//WebElement men = driver.findElementByXPath("//a[text()='Men']");
		
		//Create Object for actions class for advanced user interactions
		Actions builder = new Actions(driver);
		
	//	builder.dragAndDrop(source, target).perform();
		
		builder.dragAndDropBy(source, 100, 50).perform();
		
		//builder.keyDown(Keys.CONTROL).click(selenium).click(appium).keyUp(Keys.CONTROL).perform();
		
		
		//Mouse Hover
		//builder.moveToElement(men).perform();
		
		//To right click on a element
		//builder.contextClick(men).perform();
		
		//to double click on a element
		//builder.doubleClick(men).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
