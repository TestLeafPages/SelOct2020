package testng.day3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToTakeScreenshot {

	@Test
	public void createLead() throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement username = driver.findElementByXPath("//label");
		
		
		
		//take the screenshot of browser
		//File source = driver.getScreenshotAs(OutputType.FILE);
		
		//to take the screenshot of WebElement
		File source = username.getScreenshotAs(OutputType.FILE);
		
		
		//create the target file
		File target = new File("./snaps/username.png");
		
		//copy the source to target
		FileUtils.copyFile(source, target);
		
		
		/*
		 * driver.findElementById("username").sendKeys("Demosalesmanager");
		 * driver.findElementById("password").sendKeys("crmsfa");
		 * driver.findElementByClassName("decorativeSubmit").click();
		 * driver.findElementByLinkText("CRM/SFA").click();
		 * driver.findElementByLinkText("Leads").click(); driver.close();
		 */

	}

}
