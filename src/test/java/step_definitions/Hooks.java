package step_definitions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;
import utilities.Driver;

public class Hooks {
	
		protected WebDriver driver;
				
		@Before 
		public void setupMethod() {
			String browser = ConfigReader.getProperty("browser");
			driver = Driver.getDriver(browser);
			driver.manage().timeouts().
				implicitlyWait(Long.parseLong(ConfigReader.getProperty("implicitTimeout")), TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(ConfigReader.getProperty("url"));
		
		}
		

		@After
		public void teardownMethod(Scenario scenario) {		
			if(scenario.isFailed()) {
				byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
				
				String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
				scenario.attach(screenshot, "image/png", "Screenshot"+date);
			}
			Driver.quit();
		}


}
