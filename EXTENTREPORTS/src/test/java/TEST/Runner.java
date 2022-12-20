package TEST;


import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"json:target/cucumber-report.json"}, 
features = "src/test/resources/FEATUREFILES/Extent.feature", glue="TEST", monochrome = true)

public class Runner {

}
