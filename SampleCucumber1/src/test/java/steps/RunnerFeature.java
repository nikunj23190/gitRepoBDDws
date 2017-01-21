package steps;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/java/features/"
		,tags = "@Signup-DataDriven"
		//,dryRun = false
		,glue = {"newStepsDefinations"}
		)
public class RunnerFeature{
}