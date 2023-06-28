package executor;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\resources\\Electronics\\"},
		glue= {"stepdefinition"},
		plugin= {"pretty"}
		,tags="@DataDriven"
		
		)

public class RunTestCase {

}
