package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/Amazon_featureFiles"},
					glue = {"Amazon_StepDefinition"},
					monochrome = true, 
					dryRun = false,
					tags = {"@Demo"},
					strict = true,
					plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json"})

public class testrunner {

}
