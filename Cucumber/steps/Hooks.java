package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {
	
	
	@Before
	public void preCondition(Scenario sc) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println(sc.getId());
		System.out.println(sc.getName());

	}
	
	@After
	public void postCondition(Scenario sc) {
		driver.close();
		
		System.out.println(sc.getStatus());
		

	}
	
	

}
