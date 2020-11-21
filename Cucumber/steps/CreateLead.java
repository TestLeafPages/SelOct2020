package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead extends BaseClass{
	
	@When("click on crmsfa link")
	public void clickCrmsfaLink() {
		driver.findElementByLinkText("CRM/SFA").click();

	}
	
	@Then("MyHome page should be displayed")
	public void verifyMyHomePage() {
		System.out.println("MyHome page is displayed");

	}

}
