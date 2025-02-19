package Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<WebDriver>();
	
	public WebDriver init_driver() {
		tldriver.set(new ChromeDriver());
		
		
		getdriver().manage().window().maximize();
		getdriver().manage().deleteAllCookies();
		return getdriver();
		
		
		
	}
	
	
	
	public static WebDriver getdriver() {
	   return	tldriver.get();
	}

}
