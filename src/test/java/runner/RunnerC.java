package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// make sure when you type classpath:features, all letters are lower case
		features = "classpath:features",
		glue = "stepDefinations",
		tags = "@Scenario1",
		dryRun = false,
		monochrome = true,
		plugin = {
				"pretty",
				"html:target/site/cucumber-pretty",
				"json:target/cucumber.json" },
		publish = true
		)

public class RunnerC {
	

}
