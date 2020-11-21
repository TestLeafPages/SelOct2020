package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/features", 
				glue = "steps",  //package name of the stepDefinition
				monochrome = true //to remove the junk characters
				//snippets = SnippetType.CAMELCASE
				)
public class RunLogin extends AbstractTestNGCucumberTests {

}
