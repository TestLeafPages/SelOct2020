package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/features", 
				glue = "steps",  //package name of the stepDefinition
				monochrome = true, //to remove the junk characters
				//tags = {"@regression"} // to execute only regression
				//tags = {"@functional,@smoke"} // to execute the scenarios with functional or smoke
				//tags = {"@functional","@regression"} // to execute all scenarios having smoke and regression
				//tags = {"~@regression"}, //to execute all the scenarios except regression
				plugin = {"pretty","html:reports"}
				//snippets = SnippetType.CAMELCASE
				)
public class RunLogin extends AbstractTestNGCucumberTests {

}
