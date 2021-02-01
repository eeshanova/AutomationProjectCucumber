package runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)

@CucumberOptions (
		
		
		
		features = "@target/failed-scenarios.txt",  
		glue = "step_definitions",
		plugin = {  
			    "html:target/html-report.html", // to generate basic cucumber html report
			    
	         }  

				
		)
public class FailedScenariosRunner {

}