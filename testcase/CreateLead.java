package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setFile() {
		excelFileName = "CreateLead";

	}

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String company, String firstName, String lastName) {

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
		driver.findElementByName("submitButton").click();

	}
	
	

	/*
	 * @DataProvider(name="fetchData") public String[][] sendData() throws
	 * IOException {
	 * 
	 * //String[][] data = ReadExcel.readData();
	 * 
	 * //String[][] data = new String[2][3];
	 * 
	 * data[0][0] = "Testleaf"; data[0][1] = "Hari"; data[0][2] = "R";
	 * 
	 * data[1][0] = "TL"; data[1][1] = "Naveen"; data[1][2] = "E";
	 * 
	 * 
	 * return ReadExcel.readData();
	 * 
	 * }
	 */

}
