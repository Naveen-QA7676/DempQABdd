package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features= {"Features\\Elements.feature"},
glue= {"StepDef", "Runner"},
tags = "@ElementButtons",  

		dryRun=false,
				monochrome=true,
				plugin= {"pretty", "html:test-output"}
		
		)











public class Runner {

}
