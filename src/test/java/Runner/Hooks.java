package Runner;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public WebDriver driver;
	
	public DriverFactory driverfactory;
	
	@Before(order = 0)
public void getProperty() {
		driverfactory=new DriverFactory();
		driver=driverfactory.init_driver();
		
	}
	
	
	
	@After(order = 1)
		public void teardown() {
			driverfactory.getdriver().close();
		
	}
}
