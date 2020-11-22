package week1.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyBrokenLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		List<WebElement> allLinks = driver.findElementsByTagName("a");

		for (WebElement eachElement : allLinks) {

			eachElement.click();

			String title = driver.getTitle();

			String linkText = eachElement.getText();

			if (title.contains("Not Found")) {

				System.out.println(linkText + " :is broken");

				driver.navigate().back();

			}

		}

	}

}
