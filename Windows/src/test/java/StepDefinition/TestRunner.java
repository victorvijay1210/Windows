package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/newfeature", glue = {
		"StepDefinition" },  tags = "@sanitytest1 or @sanitytest2" , monochrome = true, plugin = { "json:target/cucumber.json" }

)

public class TestRunner {

}

