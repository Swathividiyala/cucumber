package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features="src/test/java/features", 
	glue="stepDefination", tags= "@SanityTest", dryRun=true, monochrome=true, strict=true,
	plugin= {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml"},
    stepNotifications = true
		
		)

public class TestRunner {

}
