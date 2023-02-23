package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
				 glue={"steps","hook"},
				 publish=true,
				 plugin={"pretty","html:target/CucumberReports/CucumberReport.html"},
		tags = "@header"
)
public class TestRunner {
	
	

}
